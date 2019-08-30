package com.example.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Monitor implements Runnable {

	// private static HashMap<Service, Caller> hm = new HashMap<Service, Caller>();
	private static Monitor instance;
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;

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
	// <Service, List of Callers (caller, frequency)>

	// 2 service,1 caller 1,2
	// Caller 1 : Google , freq : 1.5 sec --checking..
	// Caller 2 : Google, freq : 2 sec
	//
	// 1.5 sec, 3 sec ,

	// final Map<Service, List<Caller>> registerCache = new TreeMap<Service, List<Caller>>();
	// final Map<Service, Integer> hm = new TreeMap<Service, Integer>();
	//
	// public void register(Service s, int freq, Caller client) {
	//
	// if (registerCache.containsKey(client) && registerCache.get(client).containsValue(s))
	// return;
	// else {
	// registerCache.putIfAbsent(s, new TreeMap<Service, Integer>());
	// registerCache.get(s).putIfAbsent(s, freq);
	// }
	//
	// }

	boolean checkServiceStatus(Service s, String address, int port) {
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");

			// takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
			return true;
		} catch (UnknownHostException u) {
			System.out.println(u);
		} catch (IOException i) {
			System.out.println(i);
		}

		return false;

	}

	// public void plannedOutageRegistration(Service,Caller,int startTime, int endTime) {
	//
	// }
	@Override
	public void run() {

	}
	

}
