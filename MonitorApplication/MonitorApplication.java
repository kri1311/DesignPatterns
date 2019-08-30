package com.example.practice;

public class MonitorApplication implements Caller {

	public static void main(String args[]) {

		MonitorApplication mp = new MonitorApplication();

		Service s = Service.of("127.0.0.1", 8080);

		Monitor m = Monitor.getInstance();
		m.checkServiceStatus(s, "127.0.0.1", 8080);

		m.register(s, 3, mp);
	}

	@Override
	public void serviceUp(Service s) {
		// TODO Auto-generated method stub
		/*
		 * If the connection is established, the service is up
		 * 
		 */
		// if (serviceCache.containsKey(ip) && serviceCache.get(ip).containsKey(port))
		// return true;
		// else
		// return false;
		System.out.println("Service" + s.toString() + " is up");

	}

	@Override
	public void serviceDown(Service s) {
		// TODO Auto-generated method stub
		/*
		 * If the connection doesn't established, the service is down
		 * 
		 */
		/// Logic to notify callers
		// return false;
		System.out.println("Service" + s.toString() + " is down");
	}

}
