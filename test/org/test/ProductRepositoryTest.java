package org.test;

import static org.junit.Assert.assertEquals;

import org.dev.Product;
import org.dev.ProductRepository;
import org.junit.Test;

public class ProductRepositoryTest {
	
	@Test
	public void testAddOneProduct() {
		ProductRepository prodRepo = new ProductRepository();
		prodRepo.addProduct(new Product(1,"product1",100));
		int actualSize = prodRepo.getProducts().size();
		assertEquals(actualSize, 1);
	}

}
