package com.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class OrdersDao {

	@Autowired
	EntityManagerFactory emf;
	
	
	public int placeOrder(Orders order) {
		try {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(order);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Orders> viewAllOrders() {
		EntityManager manager = emf.createEntityManager();

		Query qry = manager.createNamedQuery("select o from Orders o");
		List<Orders> listOfOrders = qry.getResultList();
		return listOfOrders;
	}
}
