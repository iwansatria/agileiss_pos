package org.dev;

public class DiscountScenarioThirtyPercentOffAllItems extends DiscountScenario {

	@Override
	public void apply(ShoppingCart givenCart) {
		
		
		for(Product product : givenCart.getCart())
		{
			product.setPrice(product.getPrice() * 0.70);
		}
		
	}

}
