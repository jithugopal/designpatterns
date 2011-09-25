package com.poc.factory;

public class ItalianPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		return new ItalianPizza();
	}

}
