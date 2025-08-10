package com.tka.p6IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// String
// Math

@Component			// type - <Bean>
public class A {
	
	@Autowired
	Car car;	// = new Car();
	
	public void drive() {
		
		// car = new Car();		// obj creation...
		
		// Operation >
		car.name = "KIA";
		car.color = "white";
		
		System.out.println(car + " > is running...");
		System.out.println("color : " + car.color);
	}
	
}
