package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootAuthenticationAndAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuthenticationAndAuthorizationApplication.class, args);
		System.out.println("spring boot security up on port number 8080");
	}

}
