package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class ProductMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroServiceApplication.class, args);
		System.err.println("product reactive micro service up!");
	}

}
