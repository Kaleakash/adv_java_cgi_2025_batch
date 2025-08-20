package com.service;

import java.util.List;
import java.util.Map;

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
	public List<Map<String, Object>>  findAllProductsAsMap() {
		return productDao.findAllProductRecordAsAMap();
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProductsAsList() {
		// apply business logic if you need. 
		return productDao.findAllProductAsListOfProduct();
	}
	
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
}
