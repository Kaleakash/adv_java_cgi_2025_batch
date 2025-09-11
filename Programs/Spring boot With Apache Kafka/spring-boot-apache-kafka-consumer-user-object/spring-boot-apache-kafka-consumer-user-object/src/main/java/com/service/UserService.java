package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.bean.Users;

@Service
public class UserService {

	
	@KafkaListener(topics = "mytopic",groupId = "group-id")
	public void getUserDefinedObjectFromKafka(@Payload Users user) {
		System.out.println("name is "+user.getName()+" Age is "+user.getAge());
	}
	
}
