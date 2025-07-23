package com.entity;
import com.bean.Employee;

public class Manager extends Employee{

	public void disMgr() {
		//System.out.println("id is "+id);		// private 
		//System.out.println("name is "+name);	// default 
		System.out.println("salary is "+salary);
		System.out.println("desg is "+designation);
	}
}
