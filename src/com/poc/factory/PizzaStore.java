package com.poc.factory;

public abstract class PizzaStore {
	
	private Pizza pizza;
	
	public void orderPizza(String type){
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.cut();
		pizza.bake();
		System.out.println(pizza.toString());
	}

	abstract Pizza createPizza(String type);

}
