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
    private final Map<Service, Timer> serviceTimer =new HashMap<Service,Timer>();
    private final Map<Service, Integer> map = new HashMap<Service, Integer>();
    
	public void register(Service s, int freq, Caller client, int graceTime) {

		if ((registerCache.containsKey(s)) && registerCache.get(s).contains(client))
			return;
		else {
			registerCache.putIfAbsent(s, new ArrayList<Caller>());
			registerCache.get(s).add(client);

		}
		if(serviceTimer.containsKey(s)) {
			serviceTimer.get(s).cancel();
			
		}
		// To calculate the minimum frequency 
		hm.put(s, Math.min(freq, hm.getOrDefault(s, Integer.MAX_VALUE)));
		
		// To calculate the minimum graceTime
		map.put(s, Math.min(graceTime, map.getOrDefault(s, Integer.MAX_VALUE)));
		
		Timer t1 = new Timer();
		serviceTimer.put(s, t1);
		t1.schedule(new ServiceStatus(s, registerCache.get(s), psoMap.get(s),map.get(s)*1000), 0, hm.get(s)*1000);
		

	}

	private final Map<Service, Map<Caller, PlannedServiceOutage>> psoMap = new HashMap<Service, Map<Caller, PlannedServiceOutage>>();

	public void register(Service s, int freq, Caller client, LocalTime startTime, LocalTime endTime,int graceTime) {
		register(s, freq, client,graceTime);
		if (!((psoMap.containsKey(s))))
			psoMap.putIfAbsent(s, new HashMap<Caller, PlannedServiceOutage>());
		psoMap.get(s).putIfAbsent(client, new PlannedServiceOutage(startTime, endTime));
	}

}
//Current problems : multiple instances of ServiceStatus 
