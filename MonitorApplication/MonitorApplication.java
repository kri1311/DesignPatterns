package com.monitor.service;

public class MonitorApplication implements Caller {

	public static void main(String args[]) {

		MonitorApplication mp = new MonitorApplication();

		Service s = Service.of("172.217.16.163", 80);

		Monitor m = Monitor.getInstance();

		// if (!status) {
		// System.out.println("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") refused.");
		// }
		m.register(s, 3, mp);
		s.notifyAll();
	}

	@Override
	public void serviceUp(Service s) {
		System.out.println("Service" + s.toString() + " is up");
	}

	@Override
	public void serviceDown(Service s) {

		System.out.println("Service" + s.toString() + " is down");
	}
}
// clean code
// 1 timer for every service
// timers runs with lowest frequency
// test with different frequency for couple of services.
