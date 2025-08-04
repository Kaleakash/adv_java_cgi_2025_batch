package com.service;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	public Product getProductFromService() {
		
		return pd.getProductFromDao();
	}
}
