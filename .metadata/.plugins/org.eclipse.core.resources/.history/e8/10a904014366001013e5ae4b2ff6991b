package com.tka.p3DomoJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class webController {
	@GetMapping("/")
	public String welCome() {
		return "welcome";
	}
	
	@GetMapping("/get-indexPage")
	public String m1() {
		return "index";
	}
	
	@GetMapping("/user-register")
	public String m2() {
		return "userRegForm";
	}
	
	@PostMapping("/insert-user")
	public String m3(@ModelAttribute User user) {
		System.out.println("User > " + user);
		return "home";
	}
}
