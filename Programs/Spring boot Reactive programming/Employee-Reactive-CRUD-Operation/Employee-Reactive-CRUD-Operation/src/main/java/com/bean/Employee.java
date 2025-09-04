package com.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Table("employee")
public class Employee implements Persistable<Integer>{
@Id
private Integer id;
private String name;
private float salary;

@Override
public boolean isNew() {
		// TODO Auto-generated method stub
		return true;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
