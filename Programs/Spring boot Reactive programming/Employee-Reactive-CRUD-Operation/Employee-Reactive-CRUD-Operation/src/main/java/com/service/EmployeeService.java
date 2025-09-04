package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public Mono<Employee> storeEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Flux<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
}
