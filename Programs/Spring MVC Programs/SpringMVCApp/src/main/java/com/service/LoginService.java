package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public boolean signIn(Login login) {
		if(loginDao.signIn(login)>0) {
			return true;
		}else {
			return false;
		}
	}
}
