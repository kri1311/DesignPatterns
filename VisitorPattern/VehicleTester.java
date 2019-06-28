package com.practice.example;
import java.util.ArrayList;
import java.util.List;

import junit.framework.*;


public class VehicleTester extends TestCase {
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	List<String> vehiclesWithBlueColor=new ArrayList<String>();
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
	
   // Test the color of Element Car
   public void testCarColor(){
	  Car c = new Car("BMW",100,90.25,"BLUE");
      assertTrue(c.getColor()== "BLUE");
   }
   
   // Test the color of Element Truck
   public void testTruckColor(){
		  Truck truck = new Truck("AshokLeyLand",210,97.25,"BLUE");
	      assertTrue(truck.getColor()== "BLUE");
	   }
   
   // Test the color of Element Bike
   public void testBikeColor(){
		  Bike bike = new Bike("Hero",130,91.25,"BLUE");
	      assertTrue(bike.getColor()== "BLUE");
	   }
   
   // Test the price of Element Car
   public void testCarPrice(){
	  Car c = new Car("BMW",100,90.25,"BLUE");
      assertTrue(c.getPrice()== 100);
   }
   
   // Test the price of Element Truck
   public void testTruckPrice(){
		  Truck truck = new Truck("AshokLeyLand",210,97.25,"BLUE");
	      assertTrue(truck.getPrice()== 210);
	   }
   
   // Test the price of Element Bike
   public void testBikePrice(){
		  Bike bike = new Bike("Hero",130,91.25,"BLUE");
	      assertTrue(bike.getPrice()== 131);
	   }
   
   // Test the weight of Element Bike
   public void testCarWeight(){
		  Car c = new Car("BMW",100,90.25,"BLUE");
	      assertTrue(c.getWeight()== 90.25);
	   }
	   
   // Test the weight of Element Truck
   public void testTruckWeight(){
		  Truck truck = new Truck("AshokLeyLand",210,97.25,"BLUE");
		  assertTrue(truck.getWeight()== 97.25);
	   }
	   
	   // Test the weight of Element Bike
   public void testBikeWeight(){
		  Bike bike = new Bike("Hero",130,91.25,"BLUE");
		  assertTrue(bike.getWeight()== 91.25);
	 }
   
   //Test the Max Price Visitor
   public void testMaxPriceVisitor() {
	   MaxPriceVisitor vv = new MaxPriceVisitor();
	   assert(vv.getMaxPrice()==210);	   
   }
   
   //Test the Max Weight Visitor
   public void testMaxWeightVisitor() {
	   MaxWeightVisitor mpv = new MaxWeightVisitor();
	   assert(mpv.getMaxWeight()==97.25);	
	   
   }
   
   //Test the BlueColor Visitor
   public void testBlueColorVisitor() {
	   BlueColorVisitor bcv = new BlueColorVisitor();
	   vehiclesWithBlueColor=bcv.getBlueColorVehicles(vehicles);
	   assert(vehiclesWithBlueColor.contains("Hero")==true);   //,System.out.print(" "+vehicleName);
	   assert(vehiclesWithBlueColor.contains("BMW")==true);
	   assert(vehiclesWithBlueColor.contains("AshokLeyLand")==true);
	   assert(vehiclesWithBlueColor.contains("Asia Motors")==true);
	   assert(vehiclesWithBlueColor.contains("Audi")==true);
	   
	   
   }
   
}

