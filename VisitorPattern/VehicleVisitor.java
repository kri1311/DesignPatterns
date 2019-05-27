package com.practice.example;

public interface VehicleVisitor {
	
	public void visit(Car car);
	public void visit(Bike bike);
	public void visit(Truck truck);

}
