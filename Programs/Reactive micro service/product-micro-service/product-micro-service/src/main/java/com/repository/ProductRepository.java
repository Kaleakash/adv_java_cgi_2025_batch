package com.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;
@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Integer>{

}
