package com.monitor.service;

import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class Service {

	private static Map<String, TreeMap<Integer, Service>> serviceCache = new TreeMap<String, TreeMap<Integer, Service>>(); // Service Cache to store service related information

	/*
	 * Service is combination of IP address and Port number
	 * 
	 */
	private final String ip;
	private final int port;
	//private final LocalTime graceTime;

	@Override
	public String toString() {
		return ip + ":" + port;
	}

	/*
	 * If service is existing in serviceCache, return it, otherwise create new one and return new one
	 */

	public static Service of(String ip, int port) {

		if (serviceCache.containsKey(ip) && serviceCache.get(ip).containsKey(port)) {
			return serviceCache.get(ip).get(port);
		} else {

			Service s = new Service(ip, port);
			serviceCache.putIfAbsent(ip, new TreeMap<Integer, Service>());
			serviceCache.get(ip).putIfAbsent(port, s);

			return s;
		}

	}

	private Service(String ip, int port) {
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
