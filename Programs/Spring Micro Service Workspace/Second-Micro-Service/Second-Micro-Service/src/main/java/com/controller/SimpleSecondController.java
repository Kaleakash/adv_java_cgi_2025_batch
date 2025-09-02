package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleSecondController {

	@RequestMapping(value = "/")
	public String secondClient() {
		return "Welcome to Micro Service Rest API by second project ";
	}
}
