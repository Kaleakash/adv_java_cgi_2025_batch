package com.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
//	Product productFromDb  =  manager.find(Product.class, 101);
//	if(productFromDb==null) {
//		System.out.println("Record not present");
//	}else {
//		System.out.println(productFromDb);
//	}
	
	// retrieve all records using JPQL 
//	Query qry = manager.createQuery("select p from Product p");
//	List<Product> listOfProduct = qry.getResultList();
//	System.out.println("Number of records are "+listOfProduct.size());
//	Iterator<Product> li = listOfProduct.iterator();
//	while(li.hasNext()) {
//		Product p = li.next();
//		System.out.println(p);
//	}
	
	// retrieve all records using JPQL with where clause 
//	Query qry = manager.createQuery("select p from Product p where p.pid=101");
//	List<Product> listOfProduct = qry.getResultList();
//	System.out.println("Number of records are "+listOfProduct.size());
//	Iterator<Product> li = listOfProduct.iterator();
//	while(li.hasNext()) {
//		Product p = li.next();
//		System.out.println(p);
//	}
	
	
	// retrieve all records using JPQL with where clause with value dynamic with ? 
//		Query qry = manager.createQuery("select p from Product p where p.pid=?1");
//		qry.setParameter(1, 101);
//		List<Product> listOfProduct = qry.getResultList();
//		System.out.println("Number of records are "+listOfProduct.size());
//		Iterator<Product> li = listOfProduct.iterator();
//		while(li.hasNext()) {
//			Product p = li.next();
//			System.out.println(p);
//		}
	
	// retrieve all records using JPQL with where clause with value dynamic with label query 
//	Query qry = manager.createQuery("select p from Product p where p.pid=:product_id");
//	qry.setParameter("product_id", 101);
//	List<Product> listOfProduct = qry.getResultList();
//	System.out.println("Number of records are "+listOfProduct.size());
//	Iterator<Product> li = listOfProduct.iterator();
//	while(li.hasNext()) {
//		Product p = li.next();
//		System.out.println(p);
//	}
	
	// Retrieval partial object ie product id
//		Query qry = manager.createQuery("select p.pid from Product p");
//		List<Integer> listOfProduct = qry.getResultList();
//		Iterator<Integer> li = listOfProduct.iterator();
//		while(li.hasNext()) {
//			int pid = li.next();
//			System.out.println(pid);
//		}

	// Retrieval partial object ie product pname and price
//	Query qry = manager.createQuery("select p.pname,p.price from Product p");
//	List<Object[]> listOfProduct = qry.getResultList();
//	Iterator<Object[]> li = listOfProduct.iterator();
//	while(li.hasNext()) {
//		Object []obj=li.next();
//		System.out.println(" PName "+obj[0]+" Price is "+obj[1]);
//	}
	
	
	}

}
