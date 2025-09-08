package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bean.OrderResponse;
import com.bean.Product;

import reactor.core.publisher.Mono;

@Service
public class OrdersService {

	
	@Autowired
	WebClient.Builder webClient;
	
	String ProductBaseURL ="http://product-micro-service/product";
	
	public Mono<OrderResponse<Product>> placeOrder(int pid) {
		System.out.println("pid is "+pid);
		
		//webClient.build().get().uri(ProductBaseURL+"/findbyid/"+pid).retrieve().
		
		return webClient.build().get().uri(ProductBaseURL+"/findbyid/"+pid).retrieve().
		bodyToMono(new ParameterizedTypeReference<OrderResponse<Product>>() {}).
		flatMap(response->{
			System.out.println("came here");
			System.out.println(response);
			
			return null;
		});
	}
}
