package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com") // Enable @controller, @service, @repository annotation 
@EntityScan(basePackages = "com.bean")  // Enable @Entity annotation 
public class PmsUsingSpringBootWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsUsingSpringBootWithJpaApplication.class, args);
		System.out.println("spring boot with JPA up!");
	}

}
