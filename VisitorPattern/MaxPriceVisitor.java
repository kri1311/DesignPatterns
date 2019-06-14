package com.practice.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxPriceVisitor {
	
//	public void printVehiclesWithMaxPrice(Vehicle vlist[]) {
//		System.out.println("Following vehicles have the maximum price among all vehicles");
//		for(Vehicle v : vlist) {
//			System.out.print(v+" ");
//			
//		}
//		
//	}
	
	public int findMaxPriceVehicle(ArrayList<Vehicle> vehicles) {
		List<Integer> priceList= new ArrayList<Integer>();
		for(Vehicle v : vehicles) {
			priceList.add(v.getPrice());
			
		Collections.sort(priceList);
		
		return priceList.get(priceList.size()-1);
				
				
			}
		}
	}
	

