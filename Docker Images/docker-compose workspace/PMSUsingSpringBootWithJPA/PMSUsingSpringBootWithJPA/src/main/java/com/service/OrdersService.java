package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Orders;
import com.dao.OrdersDao;


@Service
public class OrdersService {

	@Autowired
	OrdersDao ordersDao;
	
	
	public String orderPlace(Orders order) {
		if(ordersDao.placeOrder(order)>0) {
			return "order place successfully";
		}else {
			return "order didn't place";
			
		}
	}
	
	public List<Orders> viewAllOrders() {
		return ordersDao.viewAllOrders();
	}
}
