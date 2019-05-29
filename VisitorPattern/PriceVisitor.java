package com.practice.example;

public class PriceVisitor implements VehicleVisitor{
	
	public void visit(Car car) {
		System.out.println("Calculating the price of the Car");
		int price=car.getPrice();
		System.out.println(price);
		
	}
	public void visit(Bike bike) {
		System.out.println("Calculating the price of the Bike");
	}
	public void visit(Truck truck) {
		System.out.println("Calculating the price of the Truck");
	}

}
