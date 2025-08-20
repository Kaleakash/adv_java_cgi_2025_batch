package com.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ProductService ps = (ProductService)ac.getBean("productService");
		int pid;
		String pname;
		float price;
		String result;
		String con="";
		do {
			System.out.println("1: Add Product 2 : View Product");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the id");
			       pid = sc.nextInt();
			       System.out.println("Enter the pname");
			       pname = sc.next();
			       System.out.println("Enter the price");
			       price = sc.nextFloat();
			       Product p = (Product)ac.getBean("product");
			       p.setPid(pid);
			       p.setPname(pname);
			       p.setPrice(price);
			       
			       result = ps.storeProduct(p);
			       System.out.println(result);
			      
				break;
			case 2 : List<Product> listOfProduct = ps.findAllProducts();
			         for(Product product:listOfProduct) {
			        	 System.out.println(product);
			         }
			         break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		
		System.out.println("thank you!");
	}

}
