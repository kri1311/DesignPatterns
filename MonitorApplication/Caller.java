package com.example.practice;

public interface Caller {

//public class Caller{
	
//	private int pollingFrequency=0;
//	private String callerName=0;
//	private int callerID;
	public void serviceUp(Service s);
    public void serviceDown(Service s);
    
//    Caller(String cName,int cID,int pollFreq){
//    	this.callerID = cID;
//    	this.callerName = cName;
//    	this.pollingFrequency = pollFreq;
//    }
//    
    
}
//convert caller class to interface

