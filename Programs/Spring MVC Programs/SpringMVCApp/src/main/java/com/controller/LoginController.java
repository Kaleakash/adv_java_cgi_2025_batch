package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	
	@RequestMapping(value = "checkloginDetails",method = RequestMethod.POST)
	public ModelAndView checkLoginInformation(HttpServletRequest req) {  // DI for request object 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "signInFromDb",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login login) {  // DI for request object as well as login
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		login.setEmailid(emailid);
		login.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		if(loginService.signIn(login)) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
