package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {

	@GetMapping(value = "")
	public String sayHello() {
		return "Welcome to Spring boot rest api without auth";
	}
	@GetMapping(value = "/wish")
	public String greeting() {
		return "Welcome to public end point";
	}
}
