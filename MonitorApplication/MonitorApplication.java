package com.monitor.service;

import java.time.LocalTime;
import java.util.logging.Logger;

public class MonitorApplication implements Caller {
	Logger logger = Logger.getLogger(MonitorApplication.class.getName());

	public static void main(String args[]) {

		// Logger logger = Logger.getLogger(MonitorApplication.class.getName());

		MonitorApplication mp = new MonitorApplication();

		// TODO - to include multiple callers

		Service s = Service.of("172.217.16.163", 82);
		Service s1 = Service.of("46.163.77.226", 80);
		// Service s3 = Service.of("13.32.250.101", 80); // www.amazon.com
		// Service s4 = Service.of("208.80.154.224", 80); // www.wikipedia.org

		// logger.setLevel(Level.FINE);

		Monitor m = Monitor.getInstance();

		m.register(s, 3, mp);
		m.register(s1, 2, mp, LocalTime.of(01, 20), LocalTime.of(01, 50));
		// TODO - do it for multiple services.
		// m.register(s3, 4, mp);
		// m.register(s4, 1, mp);

		// Register a Planned Service Outage

	}

	@Override
	public void serviceUp(Service s) {
		// System.out.println("Service" + s.toString() + " is up");
		logger.info("Service" + s.toString() + " is up");

	}

	@Override
	public void serviceDown(Service s) {

		System.out.println("Service" + s.toString() + " is down");
	}
}
