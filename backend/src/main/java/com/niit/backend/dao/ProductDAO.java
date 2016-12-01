package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Product;

public interface ProductDAO {

	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);

}
