package com.ecommerce;

import java.time.LocalDate;

public interface ProductInterface {

	String getName();
	double getPrice();
	int getQuantity();
	int getWeight();
	boolean isShipped();
	LocalDate getExpireDate();
}
