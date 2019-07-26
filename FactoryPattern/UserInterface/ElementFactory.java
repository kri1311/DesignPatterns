package com.practice.example;

public class ElementFactory  {
	public Element getElement(String ElementType) {
		Element e =  null;
		
		switch(ElementType) {
		case "Button":	
			e=new Button();
			break;
		case "Label":	
			e=new Label();
			break;
		case "TextField":	
			e=new TextField();
			break;
		}
	return e;	
  }	
}
			
	

