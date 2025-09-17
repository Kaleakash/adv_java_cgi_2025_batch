package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bean.Product;

@SpringBootTest
//@ExtendWith(SpringExtension.class)
class ProductServiceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
	void testStoreProduct() {
	
	}

	@Autowired
	ProductService productService;
	
	@Test
	void testFindAllProducts() {
	List<Product> listofproducts = productService.findAllProducts();
	assertNotNull(listofproducts);
	assertEquals(2, listofproducts.size());
	}

	
	
	@Test
	@Disabled
	void testDeleteProductUsingId() {
		
	}

	@Test
	@Disabled
	void testUpdateProductPrice() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindProduct() {
		
	}

}
