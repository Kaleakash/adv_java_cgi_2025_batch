package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("useroradmin")
public class UserController {

	@GetMapping(value = "")
	public String sayHello() {
		return "Welcome to Spring boot rest api with authentication may normal user or admin user";
	}
	@GetMapping(value = "/wish")
	public String greeting() {
		return "Welcome to User end point";
	}
}

