package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("employees")
public class EmployeeController {

		
	@GetMapping(value = "getInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Employee> getEmployee() {
		Employee emp1 =new Employee(100, "Ravi", 24000);
		Mono<Employee> mm = Mono.just(emp1);
		return mm;
	}
	@GetMapping(value = "all",produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<Employee> getAllEmployees() {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee(101, "Mahesh", 15000));
		listOfEmployees.add(new Employee(102, "Rajesh", 18000));
		listOfEmployees.add(new Employee(103, "Lokesh", 20000));
		Flux<Employee> ff = Flux.fromIterable(listOfEmployees);
		return ff;
	}
}
