package com.practice.example;

public class Truck {
	int price;
	float weight;
	String Color = "BLUE";
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public final void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void visit(VehicleDisplayVisitor a) {}

}
