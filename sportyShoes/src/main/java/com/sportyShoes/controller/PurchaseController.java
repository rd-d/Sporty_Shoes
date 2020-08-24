package com.sportyShoes.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyShoes.model.Product;
import com.sportyShoes.model.Purchase;
import com.sportyShoes.service.PurchaseService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class PurchaseController {
    
	@Autowired
	private PurchaseService purchaseservice;
	
	@PostMapping("/purchase")
	public Purchase createPurchase(@RequestBody Purchase purchase) {
		
		return purchaseservice.createPurchase(purchase);
	}

    @GetMapping("/purchases")
	public List<Purchase> getAllPurchases() {
		
		return purchaseservice.getAllPurchases();
	}

    @GetMapping(value = "/purchase/{purchaseId}")
    public Purchase findByPurchaseId(@PathVariable int purchaseId) {
    	
    	return purchaseservice.findByPurchaseId(purchaseId);
    }
    

    
    @GetMapping(value = "/purchases/{purchaseCategory}")
    public List<Product> findByProductCategory(@PathVariable String purchaseCategory) {
    	
    	return purchaseservice.findByProductCategory(purchaseCategory);
    }

    @GetMapping(value = "/purchases/{purchaseDate}")
    public List<Purchase> findByPurchaseDate(@PathVariable Date purchaseDate) {
    	
    	return purchaseservice.findByPurchaseDate(purchaseDate);
    }
}
