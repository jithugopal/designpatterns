package com.poc.abstractfactory.orchestra.Wind;

public class Flute extends WindInstrument {

	@Override
	void blow() {

		name = "Flute";
		mouthPiece = "sideways";
		System.out.println(toString());
		
	}

}
