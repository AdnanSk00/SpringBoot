package com.tka.p1SpringCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tka")		// suggest > Context Manager > 
public class P1SpringCrudApplication {		// JVM - main() ---> springBoot

	public static void main(String[] args) {
		
		SpringApplication.run(P1SpringCrudApplication.class, args);
		System.err.println("*********** WLECOME ************");
		
		// jdbc - 4 properties & hibernate - 3 pro --> cfg.xml --> spring project
		// > configurations --> application.properties
		
		// properties file --> key & value

	}

}