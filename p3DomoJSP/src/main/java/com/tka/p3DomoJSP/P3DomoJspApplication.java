package com.tka.p3DomoJSP;
//Air@07367
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class P3DomoJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(P3DomoJspApplication.class, args);
		System.err.println("***** WELCOME *******");
	}

}
