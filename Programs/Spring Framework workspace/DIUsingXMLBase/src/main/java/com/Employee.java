package com;

public class Employee {
private int id;
private String name;
private float salary;

	public void display() {
		System.out.println("this is employee class method");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("object created using empty constructor");
	}

	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created using parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
