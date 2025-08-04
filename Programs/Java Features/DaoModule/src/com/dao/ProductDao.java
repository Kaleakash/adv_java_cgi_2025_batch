package com.dao;

import com.bean.Product;

public class ProductDao {

	public Product getProductFromDao() {
		// retrieve from DB.
		Product p = new Product();
		p.setPid(100);
		p.setName("TV");
		return p;
	}
}
