package com.sportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyShoes.model.Product;
import com.sportyShoes.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ProductController {
    
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		
		return productservice.createProduct(product);
	}

    @GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return productservice.getAllProducts();
	}
    
    @DeleteMapping(value = "/product/{productId}")
    public void deleteByProductId(@PathVariable int productId) {
    	productservice.deleteByProductId(productId);
    }
    
    @GetMapping(value = "/product/{productId}")
    public Product findByProductId(@PathVariable int productId) {
    	
    	return productservice.findByProductId(productId);
    }
    
    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product) {
    	
    	return productservice.updateProduct(product);
    }
    
    @GetMapping(value = "/products/{productCategory}")
    public List<Product> findByProductCategory(@PathVariable String productCategory) {
    	
    	return productservice.findByProductCategory(productCategory);
    }

}
