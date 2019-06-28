package com.practice.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxWeightVisitor implements VehicleVisitor{

private double maxWeight;
	
	MaxWeightVisitor(){
		this.maxWeight=0;
	}
	
	public double getMaxWeight()  {
		return this.maxWeight;
	}
	@Override
	public void visit(Car car) {
		// TODO Auto-generated method stub
		this.maxWeight=Math.max(this.maxWeight, car.getWeight());
	}

	@Override
	public void visit(Bike bike) {
		// TODO Auto-generated method stub
		this.maxWeight=Math.max(this.maxWeight, bike.getWeight());
	}

	@Override
	public void visit(Truck truck) {
		// TODO Auto-generated method stub
		this.maxWeight=Math.max(this.maxWeight, truck.getWeight());
		
	}
	
	}

