package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.response.ProductResponse;
import com.service.ProductService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping(value = "store",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<ProductResponse<Product>> storeProduct(@RequestBody Product product){
		return productService.storeProduct(product);
	}
	
	@GetMapping(value = "find")
	public Mono<ProductResponse<List<Product>>> findAllProducts() {
		return productService.findAllProducts();
	}
	
	@GetMapping(value = "findbyid/{pid}")
	public Mono<ProductResponse<Product>> findById(@PathVariable int pid) {
		return productService.findProduct(pid);
	}
	
}
