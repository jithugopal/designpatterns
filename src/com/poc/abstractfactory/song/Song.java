package com.poc.abstractfactory.song;

import com.poc.abstractfactory.orchestra.Strings.StringInstrument;
import com.poc.abstractfactory.orchestra.Wind.WindInstrument;

abstract class Song {
	
	protected String name;
	protected StringInstrument stringInstrument;
	protected WindInstrument windInstrument;
	
	public void perform(){
		orchestrate();
		System.out.println("Performing...");
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", stringInstrument=" + stringInstrument
				+ ", windInstrument=" + windInstrument + "]";
	}

	abstract void orchestrate(); 
}
