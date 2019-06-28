package com.practice.example;

import java.util.ArrayList;
import java.util.List;

public class BlueColorVisitor implements VehicleVisitor{
	
    private String color;
	
	BlueColorVisitor(){
		this.color="BLUE";
	}
	
	@Override
	public void visit(Car car) {
		// TODO Auto-generated method stub
		this.color=(this.color == "BLUE")? "BLUE":null; //Math.max(this.maxPrice, car.getPrice());
	}

	@Override
	public void visit(Bike bike) {
		// TODO Auto-generated method stub
		this.color=(this.color == "BLUE")? "BLUE":null;
	}

	@Override
	public void  visit(Truck truck) {
		// TODO Auto-generated method stub
		this.color=(this.color == "BLUE")? "BLUE":null;
		
	}
	
	public List<String> getBlueColorVehicles(ArrayList<Vehicle> vehicles) {
		List<String> vehiclesWithBlueColor=new ArrayList<String>();
		for(Vehicle v : vehicles) {
			if(v.getColor()=="BLUE") {
				vehiclesWithBlueColor.add(v);
				
			}
			
		}
		return vehiclesWithBlueColor;
		
		
		

}
