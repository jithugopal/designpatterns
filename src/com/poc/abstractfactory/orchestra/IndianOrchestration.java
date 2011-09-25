package com.poc.abstractfactory.orchestra;

import com.poc.abstractfactory.orchestra.Strings.StringInstrument;
import com.poc.abstractfactory.orchestra.Strings.Violin;
import com.poc.abstractfactory.orchestra.Wind.Flute;
import com.poc.abstractfactory.orchestra.Wind.WindInstrument;

public class IndianOrchestration implements Orchestration {

	public StringInstrument getStringInst() {
		return new Violin();
	}

	public WindInstrument getWindInst() {
		return new Flute();
	}

}
