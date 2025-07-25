package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class AmzSpringMvcProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(AmzSpringMvcProject2Application.class, args);
		
		System.err.println("********* WELCOME TO AMAZON PROJECT");
	}
	

}
