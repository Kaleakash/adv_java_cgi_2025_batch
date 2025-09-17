package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationServiceTest {

	@Test
	public void testAdd() {
		OperationService service = new OperationService();
		int result = service.add(10, 20);
		assertEquals(30, result);
	}

}
