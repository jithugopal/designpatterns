package com.poc.abstractfactory.orchestra.Strings;

public abstract class StringInstrument {
	protected String name;
	protected String frequency;
	

	@Override
	public String toString() {
		return "StringInstrument [frequency=" + frequency + ", name=" + name
				+ "]";
	}
	
	

}
