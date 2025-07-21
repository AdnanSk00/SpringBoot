package com.tka.p2WebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

//@RestController		// JSON
@Controller				// .html
public class C1_webController {
	
	@GetMapping("/")
	public String m1() {
		return "index.html";
	}
	
	@GetMapping("/student-register")
	public String m2(){
		return "studRegForm.html";
	}
}
