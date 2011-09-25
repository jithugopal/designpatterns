package com.poc.factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	protected void cut(){
		System.out.println("Cutting..");
	}
	
	protected void bake(){
		System.out.println("Baking..");
	}
	
	abstract void prepare();
	
	
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", toppingsl=" + toppings + "]";
	}
		

}
