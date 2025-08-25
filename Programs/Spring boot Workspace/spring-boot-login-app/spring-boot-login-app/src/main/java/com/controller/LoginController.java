package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;
import com.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String landlingPage() {
		
		return "login";
	}
	
	@RequestMapping(value = "/signIn",method = RequestMethod.POST)
	public String signIn(HttpServletRequest req,Login login) {  // DI for request and login object
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		System.out.println(emailid+" "+password);
		login.setEmailid(emailid);
		login.setPassword(password);
		
		String result = loginService.signIn(login);
		if(result.equals("success")) {
			return "success";
		}else {
			return "failure";
		}
		
	}
}
