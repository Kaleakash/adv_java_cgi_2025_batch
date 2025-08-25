package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MySimpleController {

	// http://localhost:9090
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openFirstPage() {
		System.out.println("I Came Here - index page");
		// initialization work 
		return "index";		// using view resolved concept it search page inside template folder.
	}
	// http://localhost:9090/aboutUsPage
	
	@RequestMapping(value = "/aboutUsPage",method = RequestMethod.GET)
	public String aboutUsPageOpen() {
		System.out.println("I Came Here - about us page");
		// initialization work 
		return "aboutus";		// using view resolved concept it search page inside template folder.
	}
	// http://localhost:9090/contactUsPage
	@RequestMapping(value = "/contactUsPage",method = RequestMethod.GET)
	public String contactUsPageOpen() {
		System.out.println("I Came Here - contact us page");
		// initialization work 
		return "contactus";		// using view resolved concept it search page inside template folder.
	}
}
