package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.OrderResponse;
import com.bean.Product;
import com.service.OrdersService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	OrdersService orderService;
	
	@GetMapping(value = "place/{pid}")
	public Mono<OrderResponse<Product>> placeOrder(@PathVariable int pid) {
		System.out.println("in order controller");
		return orderService.placeOrder(pid);
	}
}
