package com.ecommerce;


import java.util.Map;

public class ShippingService {

	Map<Product , Integer> shippedProducts;
	

	public ShippingService() {
		super();
	}


	public ShippingService(Map<Product, Integer> shippedProducts) {
		super();
		this.shippedProducts = shippedProducts;
	}


public void showShippedProducts(){
	
	//check if cart is empty
		try {
			if (shippedProducts.isEmpty()) {
				throw new RuntimeException("Cart is empty");
			}
		} catch (Exception e) {
			System.out.println("Cart is empty");
		}
		
		double total =0 ;
		System.out.println("** Shipment notice **");
		
		
		for (Map.Entry<Product, Integer> entry : shippedProducts.entrySet()) {
			
					Product 	product  = entry.getKey();
		            Integer value = entry.getValue();
		            
		            if(product.isShipped()) {
		            	
		            	total += (product.getWeight()*value);
		    			System.out.println(value +"X   "+product.getName() + "    " +product.getWeight()+"g");
		            }	    	
		      }
				System.out.println("Total package weight : " +(total/1000) +"kg");
				System.out.println("");
				System.out.println("");
}

}

