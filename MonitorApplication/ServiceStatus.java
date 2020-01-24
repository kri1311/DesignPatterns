package com.monitor.service;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.logging.Logger;

public class ServiceStatus extends TimerTask {

	private final Service s;
	private final List<Caller> callers;
	private boolean previousServiceState = true;
	private final Map<Caller, PlannedServiceOutage> pso;
	private final int graceTime;

	Logger logger = Logger.getLogger(MonitorApplication.class.getName());
	// PannedServiceOutage obj - new PlannedServiceOutage();

	// TODO - Include Servicestatus constructor
	ServiceStatus(Service s, List<Caller> callers, Map<Caller, PlannedServiceOutage> pso,int graceTime) {
		// System.out.println("ServiceStatus constructor");
		logger.info("ServiceStatus  constructor");
		this.s = s;
		this.callers = callers;
		this.pso = pso;
		this.graceTime=graceTime;

	}

	@Override
	public void run() {
		System.out.println("Checking service status");
		boolean status = checkServiceStatus(s,graceTime);
		if (!status && previousServiceState) {
			for (Caller caller : callers) {
				PlannedServiceOutage psoObj = this.pso.get(caller); // To retrieve the planned service outage object
				if (LocalTime.now().isBefore(psoObj.getStartTime()) && LocalTime.now().isAfter(psoObj.getEndTime()))
					// if condition for outage time
					caller.serviceDown(s);
			}

			previousServiceState = false;
		} else if (status && !previousServiceState) {

			for (Caller caller : callers) {
				PlannedServiceOutage psoObj = this.pso.get(caller); // To retrieve the planned service outage object
				if (LocalTime.now().isBefore(psoObj.getStartTime()) && LocalTime.now().isAfter(psoObj.getEndTime()))
					// if condition for outage time
					caller.serviceUp(s);
			}
			previousServiceState = true;
		}

	}

	private boolean checkServiceStatus(Service s, int graceTime) {
		try {
			// Socket socket = new Socket(s.getIp(), s.getPort());
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(s.getIp(), s.getPort()), graceTime); // replace this time with grace time ?
			// System.out.println("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") Established."); // should be part of logger with different level
			logger.info("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") Established.");
            System.out.println("Socket is connected " + socket.isConnected());
			socket.close();

			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;

	}
}
