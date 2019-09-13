package com.monitor.service;

import junit.framework.TestCase;

public class MonitorApplicationTest extends TestCase {

	// Test the Service IP
	public void testServiceIP() {
		Service s = Service.of("172.217.16.163", 80);
		assertTrue(s.getIp() == "172.217.16.163");
	}

	// Test the Service Port
	public void testServicePort() {
		Service s = Service.of("172.217.16.163", 80);
		assertTrue(s.getPort() == 80);
	}

}
