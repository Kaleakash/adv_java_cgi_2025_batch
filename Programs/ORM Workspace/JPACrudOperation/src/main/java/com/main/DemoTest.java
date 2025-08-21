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
	
	// insert query 
//	Product p1 = new Product();
//	p1.setPid(102);
//	p1.setPname("Laptop");
//	p1.setPrice(98000);
//	
//	tran.begin();
//		manager.persist(p1);     //equal to insert query 
//	tran.commit();
//	System.out.println("Record stored...");
	
	// delete Query 
//	Product productFromDb  =  manager.find(Product.class, 100);
//	if(productFromDb==null) {
//		System.out.println("Record not present");
//	}else {
//		tran.begin();
//		manager.remove(productFromDb);
//		tran.commit();
//		System.out.println("Record deleted successfully");
//	}
	
	// update Query 
//	Product productFromDb  =  manager.find(Product.class, 101);
//	if(productFromDb==null) {
//		System.out.println("Record not present");
//	}else {
//		tran.begin();
//		productFromDb.setPrice(55000);
//		manager.merge(productFromDb);
//		tran.commit();
//		System.out.println("Record updated successfully");
//	}
	
	// find the record using pid 
	Product productFromDb  =  manager.find(Product.class, 101);
	if(productFromDb==null) {
		System.out.println("Record not present");
	}else {
		System.out.println(productFromDb);
	}
	}

}
