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
	
	//Calculate the price of all vehilces ? 
	//Find sum of all prices of all vehicles.
	// some more meaningful visitors 
	//

}
