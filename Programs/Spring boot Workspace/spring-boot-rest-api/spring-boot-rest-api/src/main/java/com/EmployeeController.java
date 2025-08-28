package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	static List<Employee> listOfEmp;
	static {
		listOfEmp=Arrays.asList(
				new Employee(100, "Ajay", 34000),
				new Employee(101, "Vijay", 38000),
				new Employee(102, "Raj", 39000),
				new Employee(103, "Mahesh", 32000)
				);
				
	}
	
	// http://localhost:8080/employee
	
	@RequestMapping(value = "employee",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeDetails() {
		Employee emp1 = new Employee(100,"Ravi",34000);
		return emp1;
	}
	
	
	// http://localhost:8080/employees
	
	@RequestMapping(value = "employees",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployees() {
		return listOfEmp;
	}
}
