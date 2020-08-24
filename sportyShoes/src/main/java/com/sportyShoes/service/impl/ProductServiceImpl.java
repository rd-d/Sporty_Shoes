package com.sportyShoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sportyShoes.model.Product;
import com.sportyShoes.repository.ProductRepository;
import com.sportyShoes.service.ProductService;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productrepository;

	@Override
	public Product createProduct(Product product) {

		return productrepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {

		return productrepository.findAll();
	}

	@Override
	public void deleteByProductId(int productId) {
		
		 productrepository.deleteByProductId(productId);
		
	}

	@Override
	public Product findByProductId(int productId) {
		
		return productrepository.findByProductId(productId);
	}
	
	
	@Override
	public Product updateProduct(Product product) {
		
		return productrepository.save(product);
	}

	@Override
	public List<Product> findByProductCategory(String productCategory) {
		
		return productrepository.findByProductCategory(productCategory);
	}

}
