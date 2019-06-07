
package com.practice.example;

public class FactoryPatternDemo extends Element{
	
	public static void main(String args[])
	{
		ElementFactory elementFactory = new ElementFactory();
		Element button = elementFactory.buildElement("button");
		Element label = elementFactory.buildElement("label");
		Element textField = elementFactory.buildElement("textField");
		
		
		
	}
}

