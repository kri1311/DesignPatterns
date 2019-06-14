package com.practice.example;

import java.util.ArrayList;
import java.util.List;

public class BlueColorVisitor {
	
	
//	public void printVehiclesWithBlueColor(List<String> vehiclesWithBlueColor) {
//		System.out.println("Following vehicles have blue color");
//		for(String v : vehiclesWithBlueColor) {
//			System.out.print(v+" ");
//		}
//	}
	
	public List<String> findBlueColorVehicles(ArrayList<Vehicle> vehicles) {
		List<String> vehiclesWithBlueColor=new ArrayList<String>();
		for(Vehicle v : vehicles) {
			if(v.getColor()=="BLUE") {
				vehiclesWithBlueColor.add(v);
				
			}
			
			
		}
		return vehiclesWithBlueColor;

}
