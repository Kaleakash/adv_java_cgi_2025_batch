package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

	@GetMapping(value = "")
	public String sayHello() {
		return "Welcome to Spring boot rest api with authentication admin user";
	}
	
	@GetMapping(value = "/wish")
	public String greeting() {
		return "Welcome to Admin End Point";
	}
}
