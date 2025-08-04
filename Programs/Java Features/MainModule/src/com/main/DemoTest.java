package com.main;


import java.util.Arrays;
import java.util.List;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps = new ProductService();
		Product product = ps.getProductFromService();
		System.out.println(product.getPid()+" "+product.getName());
		
		List<String> al = Arrays.asList("Ravi","ramesh");
		System.out.println(al);
	}

}
