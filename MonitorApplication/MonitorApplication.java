package com.example.practice;

public class MonitorApplication {
	
	public static void main(String args[]) {
		
		Service s = new Service("9.114.96.120",443,3);
		
		Monitor m = new Monitor();
		
		m.monitor("9.114.96.120",443,3, new Client());

		m.register("9.114.96.120",443,3, new Client());
	}

}
