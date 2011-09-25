package com.poc.abstractfactory.song;

import com.poc.abstractfactory.orchestra.Orchestration;

public class IndianSong extends Song {
	
	private Orchestration orchestration;
	
	public IndianSong(Orchestration orchestration){
		this.orchestration = orchestration;
	}

	@Override
	void orchestrate() {
		stringInstrument = orchestration.getStringInst();
		windInstrument   = orchestration.getWindInst();
	}

}
