package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Product;

public class DemoTest {

	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
	EntityManager manager  = emf.createEntityManager();	// like Statement or PreparedStatement
	EntityTransaction tran = manager.getTransaction();
	Product p1 = new Product();
	p1.setPid(100);
	p1.setPname("TV");
	p1.setPrice(56000);
	
	tran.begin();
		manager.persist(p1);     //equal to insert query 
	tran.commit();
	System.out.println("Record stored...");
	}

}
