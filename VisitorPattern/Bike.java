
package com.practice.example;


public class Bike implements Vehicle{
	/* RMK: better to add an explicit visibility (public, private, protected, ..) for variables. */
	private int price;
	private float weight;
	/* RMK: best practive, use capital letter for classes, lower case letter for variables and fields. */
	/* RMK: see also https://en.wikipedia.org/wiki/Naming_convention_(programming) */
	private String color;
	/* RKM: why is price and weight not inizilialized, whereas Color is set to a default value for all bikes? */
	/* RMK: add constructor to initialize values */
	
	Bike(int price,float weight,String color){
		this.color=color;
		this.price=price;
		this.weight=weight;
	}
	
	public int getPrice() {
		/* RMK: Might return null as price is not initialized */
		/* RMK: better to use "this."". */
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getWeight() {
		/* RMK: Might return null as value is not initialized */
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/* RMK: visitor call is missind */
	/* RMK: concrete visitor, breakes the visitor pattern. Use global visitor interface */
	//public void visit(VehicleVisitor a) {}
	@Override
	public void accept(VehicleVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}
}
