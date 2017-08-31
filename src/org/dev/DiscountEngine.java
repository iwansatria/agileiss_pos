package org.dev;

import java.util.ArrayList;

public class DiscountEngine {
	
	private static ArrayList<DiscountScenario> discountScenarios;
	
	static 
	{
		discountScenarios = new ArrayList<DiscountScenario>();
		
		discountScenarios.add(new DiscountScenarioThirtyPercentOffAllItems());
		
	}

	public static void apply (ShoppingCart givenCart) {
		
		for(DiscountScenario ds : discountScenarios)
		{
			ds.apply(givenCart);
		}
		
	}
}
