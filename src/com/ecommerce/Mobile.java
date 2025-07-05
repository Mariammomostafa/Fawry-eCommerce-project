package com.ecommerce;

public class Mobile extends Product{

	public Mobile(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	@Override
	public boolean isShipped() {
		return false;
	}

}
