package com.practice.example;

public class Car implements Vehicle{
	private int price;
	private float weight;
	private String color;
	
	
	Car(int price,float weight,String color){
		this.color=color;
		this.price=price;
		this.weight=weight;
	}
	
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
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/* RMK: intentsion of metod visit? */
	public void visit(VehicleDisplayVisitor a) {}
	
	
	  @Override
	  public void accept(VehicleVisitor v) {
			// TODO Auto-generated method stub
			v.visit(this);
			
		}
}
