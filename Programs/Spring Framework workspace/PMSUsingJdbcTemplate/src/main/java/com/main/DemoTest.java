package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		System.out.println("PMS using JdbcTemplate");
		do {
			System.out.println("1: Add Product 2 : View Product 3:Delete Product 4 : Update the Product");
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
			case 2 : List<Map<String, Object>> listOfProductAsMap  =ps.findAllProductsAsMap();
					Iterator<Map<String, Object>> li = listOfProductAsMap.iterator();
					while(li.hasNext()) {
						Map<String, Object> row = li.next();
						System.out.println(row);
					}
			         break;
			case 3 :System.out.println("Enter the product id to delete");
			        pid = sc.nextInt();
			        result = ps.deleteProduct(pid);
			        System.out.println(result);
			        break;
			case 4 :System.out.println("Update Product");
					System.out.println("Enter the id");
					pid = sc.nextInt();
		      
					System.out.println("Enter the price");
					price = sc.nextFloat();
		      
					Product p1 = (Product)ac.getBean("product");
					p1.setPid(pid);
					p1.setPrice(price);
				
					result = ps.updateProduct(p1);
					System.out.println(result);
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
