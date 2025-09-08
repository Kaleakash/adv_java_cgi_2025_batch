package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayAppApplication.class, args);
		System.out.println("Api gate way running on port number 8080");
	}

}
