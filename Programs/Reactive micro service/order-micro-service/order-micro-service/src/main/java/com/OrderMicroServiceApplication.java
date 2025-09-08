package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMicroServiceApplication.class, args);
		System.err.println("Order micro service up on port number 8282");
	}

	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClient() {
		return WebClient.builder();
	}

}
