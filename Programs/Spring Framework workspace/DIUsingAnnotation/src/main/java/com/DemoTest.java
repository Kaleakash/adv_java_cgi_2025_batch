package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {

		// 2nd API 
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Address add = (Address)ac.getBean("address");
//		System.out.println(add);
//			add.setCity("Pune");
//		System.out.println("--------------");
//		Employee emp = (Employee)ac.getBean("employee");
//		System.out.println(emp);
		
		// 3rd API : pure annotation base. 
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address add = (Address)ac.getBean("address");
		System.out.println(add);
			add.setCity("Pune");
		System.out.println("--------------");
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		ac.close();
	}

}
