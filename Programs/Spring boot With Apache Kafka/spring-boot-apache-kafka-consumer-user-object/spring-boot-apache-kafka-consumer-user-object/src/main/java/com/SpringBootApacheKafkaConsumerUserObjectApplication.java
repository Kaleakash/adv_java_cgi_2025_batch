package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootApacheKafkaConsumerUserObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaConsumerUserObjectApplication.class, args);
		System.out.println("spring boot kafka consumer with user defined service up on port number 9191");
	}

}
