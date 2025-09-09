package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bean.Orders;
import com.bean.Product;
import com.repository.OrdersRepository;
import com.response.OrderResponse;
import com.response.ProductResponse;

import reactor.core.publisher.Mono;

@Service
public class OrdersService {

	
	@Autowired
	WebClient.Builder webClient;
	
	@Autowired
	OrdersRepository ordersRepository;
	
	String ProductBaseURL ="http://PRODUCTSERVICE/product/";
	
	public Mono<OrderResponse<Orders>> placeOrder(int pid) {
		//System.out.println("pid is "+pid);
		
		//webClient.build().get().uri(ProductBaseURL+"/findbyid/"+pid).retrieve().
//		return webClient.build().get().uri(ProductBaseURL+"findbyid/"+pid).retrieve().
//		bodyToMono(new ParameterizedTypeReference<OrderResponse<Product>>() {}).
//		flatMap(response->{
//			System.out.println("came here");
//			System.out.println(response);
//			
//			return null;
//		}).onErrorResume(e -> Mono.just(new OrderResponse<>("Error placing order: " + e.getMessage(), null)));
		
    	return webClient.build()
                .get()
                .uri(ProductBaseURL+"findbyid/" + pid)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<ProductResponse<Product>>() {})
                .flatMap(response -> {
                	System.out.println(response);	 // Product details, product information 
                	Product p = response.getData();	// store product details 
                	Orders order = new Orders();	// oid(auto increment),pid,pname,price etc. 
                	order.setPid(pid);
                	order.setPname(p.getPname());
                	order.setPrice(p.getPrice());
                	
                    return ordersRepository.save(order)                         
                    		.map(saved -> new OrderResponse<>("Order placed successfully!", saved));
                    
                }).onErrorResume(e -> Mono.just(new OrderResponse<>("Error placing order: " + e.getMessage(), null)));
	}
	
	public Mono<OrderResponse<Orders>> getOrderById(Integer id) {
        return ordersRepository.findById(id)
                .map(order -> new OrderResponse<>("Order retrieved successfully!", order))
                .switchIfEmpty(Mono.just(new OrderResponse<>("Order not found with id: " + id, null)))
                .onErrorResume(e -> Mono.just(new OrderResponse<>("Error fetching order: " + e.getMessage(), null)));
    }
	
	public Mono<OrderResponse<List<Orders>>> viewAllOrders() {
        return ordersRepository.findAll()
        		.collectList()
                .map(orders -> new OrderResponse<>("Order retrieved successfully!", orders)); 
         }
}
