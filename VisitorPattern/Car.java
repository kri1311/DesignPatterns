package com.practice.example;

class Car implements Vehicle{
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
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void visit(VehicleDisplayVisitor a) {}
	
	
	  @Override
	   public void accept(Visitor vehicleVisitor) {
	      vehicleVisitor.visit(this);
	   }
}
