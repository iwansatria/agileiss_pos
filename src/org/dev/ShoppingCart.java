package org.dev;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> cart =new ArrayList<>();
	private DiscountScenario ds = new DiscountScenarioDoNothing();
	
	public ShoppingCart() {
		// Do nothing.
	}
	
	public ShoppingCart(DiscountScenario ds) {
		this.ds = ds;
	}
	
	public void addToCart (Product product){
		cart.add(product);
		ds.apply(this);
	}
	
	public List<Product> getCart() {
		return cart;
	}
	
	public String listProductInCart(){
		StringBuilder sb = new StringBuilder();
		for(Product product: cart){
			sb.append((product.getName()));
		}
		return sb.toString();
	}
	
	public double calculateTotalPrice() {
		double total = 0;
		for(Product product: cart){
			total += product.getFinalPrice();
		}
		return total;
	}
}
