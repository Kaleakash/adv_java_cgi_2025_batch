package com.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.bean.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public String orderPlace(Orders order) {
		order.setOrderDate(LocalDateTime.now());
		int pid = order.getPid();
		if(productRepository.existsById(pid)) {
			Optional<Product> result = productRepository.findById(pid);
			if(result.isPresent()) {
				Product productFromDb = result.get();
				if(productFromDb.getQty()-order.getQty()>=0) {
					productFromDb.setQty(productFromDb.getQty()-order.getQty());
					productRepository.saveAndFlush(productFromDb);
					ordersRepository.save(order);
					return "order place successfully";
				}else {
					return "InSufficient qty, order didn't place";
				}
			}else {
				return null;
			}
		}else {
			return "Order didn't place, becuase pid not present";
		}
	}
}
