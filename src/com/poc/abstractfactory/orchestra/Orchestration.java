package com.poc.abstractfactory.orchestra;

import com.poc.abstractfactory.orchestra.Strings.StringInstrument;
import com.poc.abstractfactory.orchestra.Wind.WindInstrument;

public interface Orchestration {
	WindInstrument getWindInst();
	StringInstrument getStringInst();
}
