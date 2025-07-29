package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Employee;
import utility.SalarySortAsc;
import utility.SalarySortDesc;

public class EmployeeSortOperation {

	public static void main(String[] args) {
	List<Employee> listOfEmployees = new ArrayList<Employee>();
	listOfEmployees.add(new Employee(2, "Ajay", 25000));
	listOfEmployees.add(new Employee(1, "Vijay", 28000));
	listOfEmployees.add(new Employee(3, "Mahesh", 22000));
	System.out.println("Employee details before sort");
	for(Employee emp:listOfEmployees) {
		System.out.println(emp);
	}
	System.out.println("-------------");
	//Collections.sort(listOfEmployees);
	Collections.sort(listOfEmployees, new SalarySortDesc());	// 1st parameter list reference and 2nd parameter comparator reference. 
	System.out.println("Employee details after sort");
	for(Employee emp:listOfEmployees) {
		System.out.println(emp);
	}
	}

}
