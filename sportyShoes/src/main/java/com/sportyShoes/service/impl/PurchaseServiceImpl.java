package com.sportyShoes.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sportyShoes.model.Product;
import com.sportyShoes.model.Purchase;
import com.sportyShoes.repository.PurchaseRepository;
import com.sportyShoes.service.PurchaseService;

@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseRepository purchaserepository;


	@Override
	public Purchase createPurchase(Purchase purchase) {
		return purchaserepository.save(purchase);
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return purchaserepository.findAll();
	}

	@Override
	public Purchase findByPurchaseId(int purchaseId) {
		return purchaserepository.findByPurchaseId(purchaseId);
	
	}

	@Override
	public List<Product> findByProductCategory(String productCategory) {
		return purchaserepository.findByProductCategory(productCategory);
	}

	@Override
	public List<Purchase> findByPurchaseDate(Date purchaseDate) {
		return purchaserepository.findByPurchaseDate(purchaseDate);
	}

}
