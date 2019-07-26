package com.practice.example;

public class Swing extends UIFactory {
	  
	public Swing() {
		//System.out.println("Inside Constructor");
	}
	    Element e = null;
	    Element getElement(String eType) {
	    switch(eType) {
			case "Button":	
				e=(Element) new Button();
				break;
			case "Label":	
				e=(Element) new Label();
				break;
			case "TextField":	
				e=(Element) new TextField();
				break;
			}
		return e;	
	    }
		@Override
		protected
		Element getElement(ElementType name) {
			// TODO Auto-generated method stub
			return null;
		}
}
