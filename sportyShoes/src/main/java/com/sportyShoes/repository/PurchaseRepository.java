package com.sportyShoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportyShoes.model.Purchase;
import com.sportyShoes.model.Product;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{
	 
	public Purchase findByPurchaseId(int purchaseId);
	public List<Purchase> findByPurchaseDate(Date purchaseDate);
	@Query(value="select * from Purchase WHERE products.productCategory= :productCategory", nativeQuery = true)
	public List<Product> findByProductCategory(@Param("productCategory") String productCategory);
}
