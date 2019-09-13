package com.example.practice;

public class MonitorApplication implements Caller {

	public static void main(String args[]) {

		MonitorApplication mp = new MonitorApplication();

		Service s = Service.of("172.217.16.163", 80);

		Monitor m = Monitor.getInstance();
		//

		m.register(s, 3, mp);
		boolean serviceStatus = m.checkServiceStatus(s);
		if (!serviceStatus) {
			System.out.println("Connection refused");
		}
	}

	@Override
	public void serviceUp(Service s) {
		// TODO Auto-generated method stub

		System.out.println("Service" + s.toString() + " is up");

	}

	@Override
	public void serviceDown(Service s) {
		// TODO Auto-generated method stub
		/// Logic to notify callers
		// return false;
		System.out.println("Service" + s.toString() + " is down");
	}

}
