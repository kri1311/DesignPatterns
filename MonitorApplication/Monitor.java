package com.monitor.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class Monitor implements Runnable { // Runnable interface can be removed

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
		/// To calculate the minimum frequency
		hm.put(s, Math.min(freq, hm.getOrDefault(s, Integer.MAX_VALUE)));
		Timer t1 = new Timer();
		t1.schedule(new ServiceStatus(s, registerCache.get(s)), 0, freq * 1000);
		//registerCache.get(client).
		client.serviceDown(s);
		client.serviceUp(s);
		

	}

	// 1 thread per socket,
	// include sleep method in run with 1s or the appropriate time gap
	@Override
	public void run() {

		Thread t = new Thread("ServiceCheckThread");
		try {
			t.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
