package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.reponse.ProductReponse;
import com.repository.ProductRepository;

import reactor.core.publisher.Mono;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Mono<ProductReponse<Product>> storeProduct(Product product) {
		return productRepository.save(product).
		map(p->new ProductReponse<Product>("Product stored", p)).
		onErrorResume(e->Mono.just(new ProductReponse<Product>("Error generated "+e.getMessage(),null)));
	}
	
	
	public Mono<ProductReponse<List<Product>>> findAllProducts() {
		return productRepository.findAll().
				collectList().
				map(products->new ProductReponse<>("all product details", products));		
	}
	public Mono<ProductReponse<Product>> findProduct(int pid) {
		return productRepository.findById(pid).
		map(p->new ProductReponse<Product>("Product details ", p)).
		switchIfEmpty(Mono.just(new ProductReponse<Product>("Product not found with id as "+pid, null))).
		onErrorResume(e->Mono.just(new ProductReponse<Product>("Error generated "+e.getMessage(),null)));	
		
	}
}
