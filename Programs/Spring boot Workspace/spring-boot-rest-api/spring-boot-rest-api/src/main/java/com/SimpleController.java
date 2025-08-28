package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	
	// http://localhost:8080/say 
	// produce the data in plain text format. 
	
	@RequestMapping(value = "say")
	public @ResponseBody String sayHello() {
	
		return "hello";
	}
}
