package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("employee")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Employee> storeEmployee(@RequestBody Employee employee){
		return employeeService.storeEmployee(employee);
	}
	
	@GetMapping(value = "find",produces =MediaType.APPLICATION_JSON_VALUE)
	public Flux<Employee> findEmployee(){
		return employeeService.findAllEmployee();
	}
}
