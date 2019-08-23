package com.example.practice;

public class MonitorApplication implements Caller  {
	
	public static void main(String args[]) {
		
		MonitorApplication mp =new MonitorApplication();
		
		
		Service s = Service.of("9.114.96.120",443);
		//Caller c = new Caller("Client A");
		
		Monitor m = Monitor.getInstance();
		
		//m.monitor("9.114.96.120",443,3, new Client());

		m.register(s,3, mp);
	}

	@Override
	public void serviceUp(Service s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceDown(Service s) {
		// TODO Auto-generated method stub
		
	}

}



