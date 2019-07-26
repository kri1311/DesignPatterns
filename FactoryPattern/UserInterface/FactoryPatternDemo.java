package com.practice.example;

public class FactoryPatternDemo {
	
	public static void main(String args[])
	{
		ElementFactory elementFactory = new ElementFactory();
		Element button = elementFactory.getElement("Button");
		System.out.println(button.buildElement());
		Element label = elementFactory.getElement("Label");
		System.out.println(label.buildElement());
		Element textField = elementFactory.getElement("TextField");
		System.out.println(textField.buildElement());
		
		
	}
}
