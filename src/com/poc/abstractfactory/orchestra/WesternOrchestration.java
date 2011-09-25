package com.poc.abstractfactory.orchestra;

import com.poc.abstractfactory.orchestra.Strings.Cello;
import com.poc.abstractfactory.orchestra.Strings.StringInstrument;
import com.poc.abstractfactory.orchestra.Wind.PanFlute;
import com.poc.abstractfactory.orchestra.Wind.WindInstrument;

public class WesternOrchestration implements Orchestration {

	public StringInstrument getStringInst() {
		return new Cello();
	}

	public WindInstrument getWindInst() {
		return new PanFlute();
	}

}
