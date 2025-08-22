package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MySimpleController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I Came Here! for hello path");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome1.jsp");
		return mav;
	}
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {
		System.out.println("I Came Here! for hi path");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome2.jsp");
		return mav;
	}
}
