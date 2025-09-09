package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}
	
	
	@Bean
	public RouteLocator myCustomGateWay(RouteLocatorBuilder build) {
		
		System.out.println("I Came Here");
		return build.routes().
				//route(r->r.path("/product/**").and().method("GET","POST").uri("http://localhost:8181")).
				route(r->r.path("/product/**").and().method("GET","POST").
						filters(f->f.addRequestParameter("msg", "hello")).
						uri("http://localhost:8181")).
				route(r->r.path("/orders/**").and().method("GET").uri("http://localhost:8282")).
				
				build();
	}

}
