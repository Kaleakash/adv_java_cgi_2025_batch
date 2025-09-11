package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Users;

@RestController
@RequestMapping("users")
public class UsersController {

	@Autowired
	KafkaTemplate<String, Users> kafkaTemplate;
	
	@PostMapping(value = "send",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendUserInfo(@RequestBody Users user) {
		kafkaTemplate.send("mytopic", user);
		return "send";
	}
}
