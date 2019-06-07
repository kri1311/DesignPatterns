
// Test the color fo the vehicle 
// Test the weight the vehicle 
// Test the price of the vehicle

package com.practice.example;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class VehicleTester {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks 
   TransportApplication transportSystem = new TransportApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   Vehicle vehicle;

   @Test
   public void testColor(){
      //add the behavior of calc service to add two numbers
      when(vehicle.getColor("Blue")).thenReturn("Blue");
		
      //test the add functionality
      Assert.assertEquals(.getColor("Blue"),"Blue",0);
   }
}
