package com.monitor.service;

import junit.framework.TestCase;

public class MonitorApplicationTest extends TestCase {

	// Test the Service IP
	Service s = Service.of("172.217.16.163", 80);

	public void testServiceIP() {

		assertTrue(s.getIp() == "172.217.16.163");
	}

	// Test the Service Port
	public void testServicePort() {
		assertTrue(s.getPort() == 80);
	}

	// Test the Service status
	public void testServiceStatus() {
		Monitor m = Monitor.getInstance();
		boolean serviceStatus = m.checkServiceStatus(s);
		assertTrue(serviceStatus == true);

	}

}
