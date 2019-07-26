package com.example.practice;

public class Service {
	
	private String ip;
	private int port;
	private int freq;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}

	public Service(String ip,int port,int freq) {
		this.ip = ip;
		this.port = port;
		this.freq = freq;
	}
}
