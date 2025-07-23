package com.tka.p4jspDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class P4jspDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(P4jspDatabaseApplication.class, args);
		
		System.err.println("******** WELCOME **********");
	}

}
