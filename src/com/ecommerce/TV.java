package com.ecommerce;

import java.time.LocalDate;


public class TV extends Product{
	
	
	

	public TV(String name, int quantity, double price, int weight) {
		super(name, quantity, price, weight);
	}

	@Override
	public LocalDate getExpireDate() {
		return null ;
	}


}
