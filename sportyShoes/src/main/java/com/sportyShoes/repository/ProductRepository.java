package com.sportyShoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sportyShoes.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	public void deleteByProductId(int productId); 
	public Product findByProductId(int productId);
	public List<Product> findByProductCategory(String productCategory);
}