package com.musicbox.dao;

import java.util.List;

import com.musicbox.model.Product;

public class ProductDao {

	private List<Product> productList;

	public List<Product> getProductList() {
		Product product1 = new Product();
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	

}