package com.monitor.service;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Monitor implements Runnable {

	private static Monitor instance;

	Monitor() {
	}

	public synchronized static Monitor getInstance() {
		if (instance == null) {
			instance = new Monitor();
		}
		return instance;
	}

	private final Map<Service, List<Caller>> registerCache = new TreeMap<Service, List<Caller>>();
	private final Map<Service, Integer> hm = new TreeMap<Service, Integer>();

	public void register(Service s, int freq, Caller client) {

		if ((registerCache.containsKey(s)) && registerCache.get(s).contains(client))
			return;
		else {
			registerCache.putIfAbsent(s, new ArrayList<Caller>());
			registerCache.get(s).add(client);

		}
		/// To calculate the minimum frequency
		hm.put(s, Math.min(freq, hm.getOrDefault(s, Integer.MAX_VALUE)));

	}

	public boolean checkServiceStatus(Service s) {
		try {
			Socket socket = new Socket(s.getIp(), s.getPort());
			System.out.println("Connection to Service (" + s.getIp() + ":" + s.getPort() + ") Established.");
			socket.close();

			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;

	}

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
