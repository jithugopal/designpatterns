package com.poc.factory;

public class IndianPIzzaStore extends PizzaStore {
	
	 Pizza createPizza(String type) {
		
			return new IndiaPizza();
			
	}

}
