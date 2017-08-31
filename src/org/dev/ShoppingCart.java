package org.dev;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> cart =new ArrayList<>();
	
	public void addToCart (Product product){
		cart.add(product);
	}
	
	public List<Product> getCart() {
		return cart;
	}
	
	
}
