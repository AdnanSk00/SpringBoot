package com.tka.p6IOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class P6IocApplication {

	public static void main(String[] args) {
		ApplicationContext cntx = SpringApplication.run(P6IocApplication.class, args);	// DD
		System.err.println("******** WELCOME **********");
		
//		A obj = getBeanObj("A.class");
		
		A obj = cntx.getBean(A.class);
		
		obj.drive(); 	// Home
		
//		@Contoller --> @getMapping("/") getHomePage(){}
//		From Web ---> call --> localhost8080:/
		
		System.out.println("Thanks*******");
		
		
	}

}
