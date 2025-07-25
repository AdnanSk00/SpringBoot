package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AmzController {
	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/get-login")
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping("/get-signup")
	public String getSignUpPage() {
		return "signup";
	}
	
	@GetMapping("/view-products")
	public String viewProductsDetails() {
		return "productsDetails";
	}
	
	@GetMapping("/view-carts")
	public String viewCartsDetails() {
		return "cartsDetails";
	}
	
	@GetMapping("/get-shopping")
	public String getShop() {
		return "shop";
	}
	
	@GetMapping("/view-orders")
	public String viewOrdersDetails() {
		return "orders";
	}
	@GetMapping("/view-bills")
	public String viewBillDetails() {
		return "billDetails";
	}
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	
}
