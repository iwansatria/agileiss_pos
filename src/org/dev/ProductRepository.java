package org.dev;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
