package com.practice.example;

public class ColorVisitor implements VehicleVisitor {
	

	public void visit(Car car) {
		System.out.println("Getting  the color of the Car");
	}
	public void visit(Bike bike) {
		System.out.println("Getting the color of the Bike");
	}
	public void visit(Truck truck) {
		System.out.println("Getting the color of the Truck");
	}

}
