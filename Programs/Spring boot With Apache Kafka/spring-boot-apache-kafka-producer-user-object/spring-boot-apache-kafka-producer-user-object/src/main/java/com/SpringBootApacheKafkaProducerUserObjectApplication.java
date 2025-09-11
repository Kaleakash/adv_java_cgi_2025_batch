package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApacheKafkaProducerUserObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaProducerUserObjectApplication.class, args);
		System.out.println("spring boot with kafka producer with user defined object running on port number 9292");
	}

}
