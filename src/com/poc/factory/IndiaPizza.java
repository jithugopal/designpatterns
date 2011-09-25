package com.poc.factory;

public class IndiaPizza extends Pizza {

	@Override
	void prepare() {
		name = "IndianPizza";
		toppings.add("Pudina");
	}

}
