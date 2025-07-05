package com.ecommerce;

import java.time.LocalDate;

public class Biscuits extends Product{

	private int weight;

	public Biscuits(String name, int quantity, double price, LocalDate expireDate, int weight) {
		super(name, quantity, price, expireDate);
		this.weight = weight;
	}

	@Override
	public boolean isShipped() {
		return false;
	}

	public int getWeight() {
		return weight;
	}

	
}
