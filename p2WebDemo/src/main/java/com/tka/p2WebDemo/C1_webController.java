package com.tka.p2WebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@Controller				// .html
@RestController		// JSON
public class C1_webController {
	
	@GetMapping("/")
	public String m1() {
		return "<html><body bgcolor = 'Red'> <h1> HTML Coding </h1> </body></html>";	// HTML-->JSON
//		return "index.html";
	}
	
	@GetMapping("/student-register")
	public String m2(){
		return "studRegForm.html";
	}
}
