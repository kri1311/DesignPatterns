package com.practice.example;

public class Truck implements Vehicle {
	private int price;
	private float weight;
	private String color;
	
	Truck(int price,float weight,String color){
		this.color=color;
		this.price=price;
		this.weight=weight;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getWeight() {
		return this.weight;
	}
	public final void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void accept(VehicleVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}

}
