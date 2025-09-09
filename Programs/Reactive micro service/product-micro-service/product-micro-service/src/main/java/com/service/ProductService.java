package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;
import com.response.ProductResponse;

import reactor.core.publisher.Mono;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Mono<ProductResponse<Product>> storeProduct(Product product) {
		return productRepository.save(product).
		map(p->new ProductResponse<Product>("Product stored", p)).
		onErrorResume(e->Mono.just(new ProductResponse<Product>("Error generated "+e.getMessage(),null)));
	}
	
	
	public Mono<ProductResponse<List<Product>>> findAllProducts() {
		return productRepository.findAll().
				collectList().
				map(products->new ProductResponse<>("all product details", products));		
	}
	public Mono<ProductResponse<Product>> findProduct(int pid) {
		System.out.println("in product service "+pid);
		return productRepository.findById(pid).
		map(p->{ System.out.println(p); return new ProductResponse<Product>("Product details ", p);}).
		switchIfEmpty(Mono.just(new ProductResponse<Product>("Product not found with id as "+pid, null))).
		onErrorResume(e->Mono.just(new ProductResponse<Product>("Error generated "+e.getMessage(),null)));	
		
	}
}
