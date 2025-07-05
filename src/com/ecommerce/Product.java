package com.ecommerce;

import java.time.LocalDate;

public abstract class Product implements ProductInterface{
	
private String name ;
	
	private int quantity;
	
	private double price;
	
	private LocalDate  expireDate;

	private boolean isShipped = true;
	
	private int weight;


	

	public Product(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Product(String name, int quantity, double price, int weight) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.weight = weight;
	}

	public Product(String name, int quantity, double price, LocalDate expireDate) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.expireDate = expireDate;
	}
	
	

	public Product(String name, int quantity, double price, LocalDate expireDate, int weight) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.expireDate = expireDate;
		this.weight = weight;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	@Override
	public String getName() {
	
		return this.name;
	}




	@Override
	public double getPrice() {
		
		return this.price;
	}

	@Override
	public int getQuantity() {
		
		return this.quantity;
	}


	@Override
	public boolean isShipped() {
		
		return true;
	}

	@Override
	public LocalDate getExpireDate() {
		
		return this.expireDate;
	}
	
	@Override
	public int getWeight() {
		return this.weight;
	}
	

}
