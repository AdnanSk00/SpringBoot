package com.tka.p2WebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class P2WebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2WebDemoApplication.class, args);
		
		System.err.println(" ************* WELCOME ***************\n\n");
	}

}
