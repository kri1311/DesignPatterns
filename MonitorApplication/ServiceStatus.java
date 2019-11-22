package com.monitor.service;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.TimerTask;
import java.util.logging.Logger;

public class ServiceStatus extends TimerTask {

	private final Service s;
	private final List<Caller> callers;
	private boolean previousServiceState = true;
	Logger logger = Logger.getLogger(MonitorApplication.class.getName());

	// TODO - Include Servicestatus constructor
	ServiceStatus(Service s, List<Caller> callers) {
		System.out.println("ServiceStatus  constructor");
		this.s = s;
		this.callers = callers;
	}

	@Override
	public void run() {
		System.out.println("Checking service status");
		boolean status = checkServiceStatus(s);
		if (!status && previousServiceState) {
			for (Caller caller : callers) {
				caller.serviceDown(s);
			}
			previousServiceState = false;
		} else if (status && !previousServiceState) {

			for (Caller caller : callers) {
				caller.serviceUp(s);
			}
			previousServiceState = true;
		}

	}

	private boolean checkServiceStatus(Service s) {
		try {
			// Socket socket = new Socket(s.getIp(), s.getPort());
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(s.getIp(), s.getPort()), 2000);
			// System.out.println("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") Established."); // should be part of logger with different level
			logger.info("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") Established.");

			socket.close();

			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;

	}
}
