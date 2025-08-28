package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	// http://localhost:8080/findEmployeeByQueryParam?id=100
	// http://localhost:8080/findEmployeeByQueryParam?id=1000
	
	@RequestMapping(value = "findEmployeeByQueryParam")
	public String findEmployeeUsingQueryParam(@RequestParam("id") int id) {
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee emp = li.next();
		if(emp.getId()==id) {
			return emp.toString();
		}
	}
		return "Employee not present";
	}
		// http://localhost:8080/findEmployeeByPathParam/100
		// http://localhost:8080/findEmployeeByPathParam/1000
	
		@RequestMapping(value = "findEmployeeByPathParam/{id}")
		public String findEmployeeUsingPathParam(@PathVariable("id") int id) {
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			if(emp.getId()==id) {
				return emp.toString();
			}
		}
			return "Employee not present";
		}
	
}
