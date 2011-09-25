package com.poc.abstractfactory.song;

import com.poc.abstractfactory.orchestra.Orchestration;

public class WesternSong extends Song {

	private Orchestration orchestration;
	private WesternSong(Orchestration orchestration) {
		this.orchestration = orchestration;
	}
	@Override
	void orchestrate() {
		stringInstrument = orchestration.getStringInst();
		windInstrument = orchestration.getWindInst();
	}

}
