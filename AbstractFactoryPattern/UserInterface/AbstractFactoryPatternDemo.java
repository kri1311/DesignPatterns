
package com.practice.example;


public class AbstractFactoryPatternDemo {
	
	public static void main(String args[])
	{
		// Getting Swing Factory
		UIFactory factory = FactoryProvider.getFactory(UIType.SWING);
       
		
      //Building UI using Swing Factory
        Element e = factory.getElement(ElementType.BUTTON);
        if (e != null) {
        	//System.out.println("Hello.");
            e.buildElement();
        } else {
            System.out.println("Element with given name doesn't exist.");
        }
        
        
        // Getting AWT Factory
        factory = FactoryProvider.getFactory(UIType.AWT);
        if (factory == null) {
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
		
      //Building UI using AWT Factory
        e = factory.getElement(ElementType.TEXTFIELD);
        if (e != null) {
        	System.out.println("Hello");
            e.buildElement();
        } else {
            System.out.println("Element with given name doesn't exist.");
        }
        
	}
}
