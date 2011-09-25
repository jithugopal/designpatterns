package com.poc.factory;

public class ItalianPizza extends Pizza {

	@Override
	void prepare() {
		name = "ItalianPizza";
		toppings.add("Mayonnaise");
	}

}
