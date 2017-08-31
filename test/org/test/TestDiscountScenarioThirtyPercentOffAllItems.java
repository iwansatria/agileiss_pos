package org.test;

import static org.junit.Assert.*;

import org.dev.DiscountEngine;
import org.dev.DiscountScenario;
import org.dev.DiscountScenarioThirtyPercentOffAllItems;
import org.dev.Product;
import org.dev.ShoppingCart;
import org.junit.Test;

public class TestDiscountScenarioThirtyPercentOffAllItems {

	@Test
	public void testApply() {
		
		//setup
		DiscountScenario ds = new DiscountScenarioThirtyPercentOffAllItems();
		ShoppingCart cart = new ShoppingCart();
		
		cart.addToCart(new Product(0, "aaa", 10));
		
		//exercise
		ds.apply(cart);
		
		//check
		assertEquals(cart.getCart().get(0).getPrice(), 10*0.7, 0.001);
		
	}

}
