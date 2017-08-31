package org.test;

import static org.junit.Assert.*;

import javax.xml.bind.SchemaOutputResolver;

import org.dev.DiscountEngine;
import org.dev.Product;
import org.dev.ProductRepository;
import org.dev.ShoppingCart;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCartSize() {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new Product(1,"product1",100));
		
		int actualSize = cart.getCart().size();
		assertEquals(actualSize, 1);
	}
	
	@Test
	public void testListDownProductInCart() {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new Product(2,"product2",110));
		cart.addToCart(new Product(2,"product3",110));
		String expectList ="product2product3";
		assertEquals(expectList, cart.listProductInCart());
	}
	
	@Test
	public void testApplyDiscounts () 	{
		
		//setup
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new Product(1, "aaa", 10));
		
		//exercise
		DiscountEngine.apply(cart);
		
		//check
		assertEquals(cart.getCart().get(0).getPrice(), 10*0.7, 0.001);
		
	}

}
