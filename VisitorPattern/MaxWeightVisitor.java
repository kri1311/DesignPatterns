package com.practice.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxWeightVisitor {

	public double findMaxWeightVisitor(ArrayList<Vehicle> vehicles) {
		
			List<Double> weightList= new ArrayList<Double>();
			for(Vehicle v : vehicles) {
				weightList.add(v.getWeight());
				
			Collections.sort(weightList);
			
			return weightList.get(weightList.size()-1);
					
				}
			}
	}

