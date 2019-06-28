package com.practice.example;

import java.util.ArrayList;


public class VisitorPatternDemo {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		//Initializing vehicles
		vehicles.add(new Car("BMW",100,90.25,"BLUE"));
		vehicles.add(new Car("Audi",110,80.50,"GREEN"));
		vehicles.add(new Car("Honda",120,45.23,"YELLOW"));
		
		vehicles.add(new Bike("Hero",130,91.25,"BLUE"));
		vehicles.add(new Bike("Jupiter",140,83.50,"GREEN"));
		vehicles.add(new Bike("TVS",150,47.23,"YELLOW"));
		
		vehicles.add(new Truck("AshokLeyLand",210,97.25,"BLUE"));
		vehicles.add(new Truck("Eicher Motors",220,89.50,"GREEN"));
		vehicles.add(new Truck("Asia Motors",300,41.23,"YELLOW"));
		
		MaxPriceVisitor vv = new MaxPriceVisitor();
//		BlueColorVisitor bv = new BlueColorVisitor();
		MaxWeightVisitor mwv = new MaxWeightVisitor();
		
//		vv.findMaxPriceVehicle(vehicles);
//		bv.findBlueColorVehicles(vehicles);
//		mpv.findMaxWeightVisitor(vehicles);
		
		for(Vehicle v : vehicles) {
			v.accept(vv);
			v.accept(mwv);
			
		}
		System.out.println("Max Price = "+vv.getMaxPrice());
		System.out.println("Max Weight = "+mwv.getMaxWeight());
	}

}





