package com.poc.factory;

public class PizzaTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PizzaStore pizzaStore = new ItalianPizzaStore();
		pizzaStore.orderPizza("Indian");
		
	}

}
