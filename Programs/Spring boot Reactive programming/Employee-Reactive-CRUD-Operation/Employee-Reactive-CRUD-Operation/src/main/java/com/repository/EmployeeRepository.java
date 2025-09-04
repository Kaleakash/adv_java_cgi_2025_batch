package com.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer>{

}
