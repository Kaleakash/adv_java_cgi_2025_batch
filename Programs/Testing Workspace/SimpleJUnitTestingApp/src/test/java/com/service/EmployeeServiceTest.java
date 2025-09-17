package com.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class EmployeeServiceTest {

	static EmployeeService service;
	
	@BeforeClass
	public static void beforeAllTest() {
		service = new EmployeeService();
	}
	
	@Test
	//@Ignore
	public void testFindEmployee() {
		//EmployeeService service = new EmployeeService();
		assertNotNull(service.findEmployee());
		assertEquals(101, service.findEmployee().getId());
		assertEquals("John", service.findEmployee().getName());
		assertEquals(45000, service.findEmployee().getSalary(), 0.01);
	}

	@Test
	//@Ignore
	public void testFindAllEmployees() {
		//EmployeeService service = new EmployeeService();	
		assertEquals(3, service.findAllEmployees().size());
		assertEquals(102, service.findAllEmployees().get(1).getId());
		assertEquals("Smith", service.findAllEmployees().get(1).getName());
		assertEquals(55000, service.findAllEmployees().get(1).getSalary(), 0.01);
	}

	@Test

	public void testCalculateYearlySalary() {
		//EmployeeService service = new EmployeeService();
		assertEquals(540000, service.calculateYearlySalary(service.findEmployee()), 0.01);
		
	}
	
	@AfterClass
	public static void afterClass() {
		service = null;
	}

}
