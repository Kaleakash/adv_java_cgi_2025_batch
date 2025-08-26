package com.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Orders;
import com.bean.Product;
import com.service.OrdersService;
import com.service.ProductService;

@Controller
public class OrdersController {

	@Autowired
	OrdersService orderService;
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "orderPlace",method = RequestMethod.GET)
	public String placeOrder(Orders order,Model model, @RequestParam("pid") int pid) {
		order.setPid(pid);
		order.setOrderdate(LocalDateTime.now());
		String result = orderService.orderPlace(order);
		model.addAttribute("result", result);
		List<Product> listOfProduct = productService.findAllProduct();
		model.addAttribute("products", listOfProduct);

		return "viewProducts";
	}
}
