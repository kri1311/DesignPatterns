package com.example.practice;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Service {
	
	private final String ip;
	private final int  port;
	private static Map<String, TreeMap<Integer, Service>> serviceCache = new TreeMap<String, TreeMap<Integer,Service>>();
	
	public static Service of(String ip,int port) {
		//If service is existing in serviceCache, return it., otherwise create new one and return new one 
		
		if(serviceCache.containsKey(ip) && serviceCache.get(ip).containsKey(port) ) {
			return serviceCache.get(ip).get(port);
		}
		else {
			
		    Service s = new Service(ip,port);
		    serviceCache.putIfAbsent(ip, new TreeMap<Integer,Service>());
		    serviceCache.get(ip).putIfAbsent(port, s);
		    
		    return s;
		}
		 
	}
	
	
	private Service(String ip,int port) {
		this.ip = ip;
		this.port = port;
		
	}
	public String getIp() {
		return ip;
	}

	public int getPort() {
		return port;
	}
	
}
//make constructor private 
// 
