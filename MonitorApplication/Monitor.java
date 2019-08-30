package com.example.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

	final Map<Service, List<Caller>> registerCache = new TreeMap<Service, List<Caller>>();
	final Map<Service, Integer> hm = new TreeMap<Service, Integer>();
	List<Caller> valSetOne = new ArrayList<Caller>();

	public void register(Service s, int freq, Caller client) {

		if ((registerCache.containsKey(s)) && registerCache.get(s).contains(client))
			return;
		else {
			// registerCache.putIfAbsent(s, new TreeMap<Service, Integer>());
			registerCache.get(s).putIfAbsent(s, valSetOne.add(client));
		}

	}

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

	@Override
	public void run() {

	}

}
