package com.example.practice;

import java.util.HashMap;

public class Monitor implements Runnable{
	
	private static HashMap<Service,Caller> hm = new HashMap<Service, Caller>();
	private static Monitor instance;
	
	private Monitor() {}
	public synchronized static Monitor getInstance() {
		if(instance==null) {
			instance = new Monitor();
		}
		return instance;
	}
	
	
	
	
	public void register(Service s,int freq, Caller client) {
		
	}
	
	public void run () {
		
	}
	// Flyweight pattern for service class
	
	

}
