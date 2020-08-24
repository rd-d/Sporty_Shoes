package com.sportyShoes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchaseId", updatable = false, nullable = true)
	private int purchaseId;
	private Date purchaseDate;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "product_purchase" , joinColumns ={ @JoinColumn(name = "productId")} , inverseJoinColumns = { @JoinColumn(name = "purchaseId") })
	private List<Product> products = new ArrayList<>();
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "user_purchase" , joinColumns ={ @JoinColumn(name = "userId") } , inverseJoinColumns = { @JoinColumn(name = "purchaseId") })
	private List<User> users = new ArrayList<>();

}






