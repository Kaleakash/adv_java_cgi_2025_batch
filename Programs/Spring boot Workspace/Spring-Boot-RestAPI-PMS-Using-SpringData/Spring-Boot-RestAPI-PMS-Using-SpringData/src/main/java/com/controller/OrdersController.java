package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Orders;
import com.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	OrdersService orderService;
	// http://localhost:8080/orderPlace
	// method : post 
	// {"pid":101,"qty":10}
	
	@RequestMapping(value = "orderPlace",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody Orders order) {
		return orderService.orderPlace(order);
	}
}
