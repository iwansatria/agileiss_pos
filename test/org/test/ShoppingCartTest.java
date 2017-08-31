package org.test;

import static org.junit.Assert.*;

import javax.xml.bind.SchemaOutputResolver;

import org.dev.Product;
import org.dev.ProductRepository;
import org.dev.ShoppingCart;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void test() {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new Product(1,"product1",100));
		
		int actualSize = cart.getCart().size();
		assertEquals(actualSize, 1);
	}

}
