package com.monitor.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class Monitor {

	private static Monitor instance;

	Monitor() {
	}

	public synchronized static Monitor getInstance() {
		if (instance == null) {
			instance = new Monitor();
		}
		return instance;
	}

	private final Map<Service, List<Caller>> registerCache = new HashMap<Service, List<Caller>>();
	private final Map<Service, Integer> hm = new HashMap<Service, Integer>();

	public void register(Service s, int freq, Caller client) {

		if ((registerCache.containsKey(s)) && registerCache.get(s).contains(client))
			return;
		else {
			registerCache.putIfAbsent(s, new ArrayList<Caller>());
			registerCache.get(s).add(client);

		}
		// To calculate the minimum frequency
		hm.put(s, Math.min(freq, hm.getOrDefault(s, Integer.MAX_VALUE)));
		Timer t1 = new Timer();
		t1.schedule(new ServiceStatus(s, registerCache.get(s), psoMap.get(s)), 0, freq * 1000);

	}

	private final Map<Service, Map<Caller, PlannedServiceOutage>> psoMap = new HashMap<Service, Map<Caller, PlannedServiceOutage>>();

	public void register(Service s, int freq, Caller client, LocalTime startTime, LocalTime endTime) {
		register(s, freq, client);
		if (!((psoMap.containsKey(s))))
			psoMap.putIfAbsent(s, new HashMap<Caller, PlannedServiceOutage>());
		psoMap.get(s).putIfAbsent(client, new PlannedServiceOutage(startTime, endTime));
	}

}
