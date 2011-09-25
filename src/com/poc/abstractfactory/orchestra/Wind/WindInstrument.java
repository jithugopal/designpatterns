package com.poc.abstractfactory.orchestra.Wind;

public abstract class WindInstrument {
	
	protected String name;
	protected String mouthPiece;
	
	abstract void blow();

	@Override
	public String toString() {
		return "WindInstrument [mouthPiece=" + mouthPiece + ", name=" + name
				+ "]";
	}

}
