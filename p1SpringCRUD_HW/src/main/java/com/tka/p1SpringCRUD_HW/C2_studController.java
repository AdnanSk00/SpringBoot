package com.tka.p1SpringCRUD_HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C2_studController {
	
	@GetMapping("/")
	public String m1() {
		return "CRUD Operations";
	}
}
