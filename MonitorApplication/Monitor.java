package com.example.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Monitor implements Runnable {

	private static HashMap<Service, Caller> hm = new HashMap<Service, Caller>();
	private static Monitor instance;

	private Monitor() {
	}

	public synchronized static Monitor getInstance() {
		if (instance == null) {
			instance = new Monitor();
		}
		return instance;
	}

	/*
	 * If a Caller is already registered for a service, skip it, else register it.
	 * 
	 */
	public void register(Service s, int freq, Caller client) {

		final Map<Caller, TreeMap<Service, Integer>> registerCache = new TreeMap<Caller, TreeMap<Service, Integer>>();

		if (registerCache.containsKey(client) && registerCache.get(client).containsValue(s))
			return;
		else {
			registerCache.putIfAbsent(client, new TreeMap<Service, Integer>());
			registerCache.get(client).putIfAbsent(s, freq);
		}

	}

	@Override
	public void run() {

	}
	// Flyweight pattern for service class

}
