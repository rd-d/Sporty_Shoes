package com.sportyShoes.service;

import java.util.List;

import com.sportyShoes.model.Product;

public interface ProductService {

	public Product createProduct(Product product);
	public List<Product> getAllProducts();
	public void deleteByProductId(int productId);
	public Product findByProductId(int productId);
	public Product updateProduct(Product product);
	public List<Product> findByProductCategory(String productCategory);
}
