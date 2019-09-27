package com.monitor.service;

import java.util.Timer;
import java.util.TimerTask;

class ServiceStatus extends TimerTask {
	@Override
	public void run() {
		System.out.println("Checking service status");

	}

	public boolean test(Service S) {
		// main method
		Timer t1 = new Timer();
		t1.schedule(new ServiceStatus(), 0, 600);

		return true;
	}
}
