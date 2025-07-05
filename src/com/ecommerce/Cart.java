package com.ecommerce;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	Map<Product, Integer> cartItems;

	public Cart() {
		cartItems = new HashMap<>();
	}

	public void addProduct(Product product, int quantity) {

		if (product.getQuantity() < quantity) {

			System.out.println(product.getName() + "  is out of stock");

		}else if (product.getExpireDate() != null && product.getExpireDate().isBefore(LocalDate.now())) {

			System.out.println(product.getName() + "  is expired");

		} else {
			product.setQuantity(product.getQuantity() - quantity);
			cartItems.put(product, quantity);
		}

	}
	
	

	Map<Product, Integer> showCart() {
		
		try {
			if (cartItems.isEmpty()) {
				throw new RuntimeException("Cart is empty");
			}
		} catch (Exception e) {
			System.out.println("Cart is empty");
		}
		return cartItems;
}

	
	//////////////////////////////////////////////////////////////////
	
	void checkout(Map<Product, Integer> cart, Customer customer) {
		
		int sum = 0, shipping = 30;

		System.out.println("** Checkout receipt **");
		
		for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
			
			Product product = entry.getKey();
			Integer value = entry.getValue();
						
			sum += (product.getPrice() * value);
			System.out.println(value + "X   " + product.getName() + "   " + product.getPrice() * value);
		}

		if (customer.getBalance() > sum) {
			customer.setBalance(customer.getBalance() - sum);
			System.out.println("----------------------");
			System.out.println("Subtotal  " + sum);
			System.out.println("Shipping  " + shipping);
			System.out.println("Amount   " + (sum + shipping));

			System.out.println("customer current balance after payment :   " + (customer.getBalance()));

		} else {
			System.out.println("----------------------");
			System.out.println(" Customer's balance is insufficient ");
		}

	}

}
