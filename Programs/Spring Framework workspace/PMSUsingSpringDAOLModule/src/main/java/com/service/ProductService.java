package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service						// singleton 
public class ProductService {

	@Autowired
	ProductDao productDao;		// byType 
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	public List<Product> findAllProducts() {
		return productDao.findAllProducts();
	}
}
