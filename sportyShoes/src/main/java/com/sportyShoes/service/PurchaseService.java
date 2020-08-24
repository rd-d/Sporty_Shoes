package com.sportyShoes.service;

import java.util.Date;
import java.util.List;

import com.sportyShoes.model.Product;
import com.sportyShoes.model.Purchase;

public interface PurchaseService {

	public Purchase createPurchase(Purchase purchase);
	public List<Purchase> getAllPurchases();
	public Purchase findByPurchaseId(int purchaseId);
	public List<Product> findByProductCategory(String productCategory);
	public List<Purchase> findByPurchaseDate(Date purchaseDate);
}
