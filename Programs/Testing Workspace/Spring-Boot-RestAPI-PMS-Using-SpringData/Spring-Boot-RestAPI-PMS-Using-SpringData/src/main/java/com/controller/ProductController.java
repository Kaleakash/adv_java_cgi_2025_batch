package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/storeProduct 
		// method : Post 
	// data : {"pid":100,"pname":"TV","price":65000}
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
	
				return productService.storeProduct(product);
	}
	
	// http://localhost:8080/findAllProducts 
	// method : Get 
	
	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
	
	// http://localhost:8080/updateProduct 
			// method : Patch 
		// data : {"pid":100,"price":68000}
		@RequestMapping(value = "updateProduct",method = RequestMethod.PATCH,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProductPrice(@RequestBody Product product) {
					return productService.updateProductPrice(product);
		}
		
		// http://localhost:8080/deleteProduct/100 
		// method : delete 
	@RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
	public String deleteProductDetails(@PathVariable("pid") int pid) {
				return productService.deleteProductUsingId(pid);
	}
}

