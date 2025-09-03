package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.PhonePay;
import com.repository.PhonePayRepository;

@Service
public class PhonePayService {

	@Autowired
	PhonePayRepository phonePayRepository;
	
	
	@Autowired
	RestTemplate restTemplate; 
	
	public String createPhonePayAccount(PhonePay phonePay) {
		String emailid = phonePay.getEmailId();
					
	int accnumber = restTemplate.getForObject("http://localhost:8383/account/findAccount/"+emailid, Integer.class);
		if(accnumber==0) {
			return "Phone Pay account didn't create becuase Bank account not exits with provided emailid as "+emailid;
		}else {
			phonePay.setAccno(accnumber);
			phonePayRepository.save(phonePay);
			return "Phone Pay account created successfully";
		}
		
	}
	
	public String findBalance(int ppid) {
		
		
		return null;
	}
}
