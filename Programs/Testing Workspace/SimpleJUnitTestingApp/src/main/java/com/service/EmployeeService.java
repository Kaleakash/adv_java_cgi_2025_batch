package com.service;

import java.util.List;

import com.bean.Employee;

public class EmployeeService {

	public Employee findEmployee() {
		Employee emp = new Employee(101, "John", 45000);
		return emp;
	}
	
	public List<Employee> findAllEmployees(){
		return List.of(new Employee(101, "John", 45000),
				new Employee(102, "Smith", 55000),
				new Employee(103, "Ravi", 65000));
	}
	public double calculateYearlySalary(Employee emp) {
		return emp.getSalary()*12;
	}	
}
