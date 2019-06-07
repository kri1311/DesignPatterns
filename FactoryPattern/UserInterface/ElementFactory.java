
package com.practice.example;

public class ElementFactory implements Element {
	private String elementType;
	public Element getElement() {
		Element e =  null;
	
	
	if(elementType=="button") {
		return new Button();
	}
	
	if(elementType=="label") {
		return new Label();
	}
	
	if(elementType=="textField") {
		return new TextField();
	}
		//usgae of switch and enum 

	}
}
