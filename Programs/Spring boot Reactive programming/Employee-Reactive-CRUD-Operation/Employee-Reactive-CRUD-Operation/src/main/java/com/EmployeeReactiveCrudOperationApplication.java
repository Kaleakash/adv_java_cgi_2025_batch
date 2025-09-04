package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class EmployeeReactiveCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeReactiveCrudOperationApplication.class, args);
		System.out.println("spring boot rective up!");
	}

}
