package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Orders;
import com.bean.Product;
import com.response.OrderResponse;
import com.service.OrdersService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	OrdersService orderService;
	
	@GetMapping(value = "place/{pid}")
	public Mono<OrderResponse<Orders>> placeOrder(@PathVariable int pid) {
		System.out.println("in order controller");
		return orderService.placeOrder(pid);
	}
	
		@GetMapping(value="find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	    public Mono<OrderResponse<Orders>> getOrder(@PathVariable Integer id) {
	        return orderService.getOrderById(id);
	    }
		@GetMapping(value = "viewAll",produces = MediaType.APPLICATION_JSON_VALUE)
		public Mono<OrderResponse<List<Orders>>> viewAllOrders() {
			return orderService.viewAllOrders();
		}
}
