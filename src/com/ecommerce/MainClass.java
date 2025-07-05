package com.ecommerce;

import java.time.LocalDate;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
	     
		//First case where all conditions achieve
	
		Cheese cheese = new Cheese("cheeder", 8, 50, LocalDate.of(2026,04 , 13), 250);
		TV tv = new TV("Toshiba", 10, 15000, 25000);
		Biscuits biscuits= new Biscuits("Mary", 45, 10, LocalDate.of(2025,10 , 25), 50);
		Mobile mobile = new Mobile("Nokia", 15, 300);
		
		Customer customer = new Customer(500000);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//second case where cheese is expired & customer's balance Not sufficient
		/*
		Cheese cheese = new Cheese("cheeder", 8, 50, LocalDate.of(2025,04 , 13), 250);
		TV tv = new TV("Toshiba", 10, 15000, 25000);
		Biscuits biscuits= new Biscuits("Mary", 45, 10, LocalDate.of(2025,10 , 25), 50);
		Mobile mobile = new Mobile("Nokia", 15, 300);
		
		Customer customer = new Customer(30000);
		*/
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		//3rd case where mobile & Mary biscuits are out of stock
		/*
		Cheese cheese = new Cheese("cheeder", 8, 50, LocalDate.of(2026,04 , 13), 250);
		TV tv = new TV("Toshiba", 10, 15000, 25000);
		Biscuits biscuits= new Biscuits("Mary", 12, 10, LocalDate.of(2025,10 , 25), 50);
		Mobile mobile = new Mobile("Nokia", 10, 300);
		
		Customer customer = new Customer(500000);
		*/

///////////////////////////////////////////////////////////////////////////////////////////////////
		
		Cart cart = new Cart();
		
		cart.addProduct(cheese, 5);
		cart.addProduct(biscuits, 20);
		cart.addProduct(mobile,15);
		cart.addProduct(tv, 3);
		
		Map<Product , Integer> cartItems	=cart.showCart();

		ShippingService service = new ShippingService(cartItems);
		service.showShippedProducts();
		
		cart.checkout(cartItems , customer);

//////////////////////////////////////////////////////////////////////////////////////////////
		
		// last case where car is empty 
		/*
		Cart cart = new Cart();
		
		Map<Product , Integer> cartItems	=cart.showCart();

		ShippingService service = new ShippingService(cartItems);
		service.showShippedProducts();
	
		cart.checkout(cartItems , customer);
		
		*/
		/////////////////////////////////////////////////////////////////////////////////////
		
	}

	
}

