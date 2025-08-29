package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		if(productRepository.existsById(product.getPid())) {
			return "Product id must be unique";
		}else {
			productRepository.save(product);
			return "Product stored";
		}
	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
	
	public String deleteProductUsingId(int pid) {
	 Optional<Product> result = productRepository.findById(pid);
	 if(result.isPresent()) {
		 	productRepository.deleteById(pid);
		 	return "Product deleted successfully";
	 }else {
		 return "Product id not present";
	 }
	}
	public String updateProductPrice(Product product) {
		 Optional<Product> result = productRepository.findById(product.getPid());
		 if(result.isPresent()) {
			Product productFromDb =result.get();	// receive product details using pid
			productFromDb.setPrice(product.getPrice()); // update new price 
				productRepository.saveAndFlush(productFromDb);
			 	return "Product details updated successfully";
		 }else {
			 return "Product id not present";
		 }
		}
}
