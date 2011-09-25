package com.poc.abstractfactory.orchestra.Wind;

public class PanFlute extends WindInstrument {

	@Override
	void blow() {

		name = "PanFlute";
		mouthPiece = "front";
		System.out.println(toString());
	}

}
