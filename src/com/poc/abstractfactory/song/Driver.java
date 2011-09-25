package com.poc.abstractfactory.song;

import com.poc.abstractfactory.orchestra.IndianOrchestration;
import com.poc.abstractfactory.orchestra.Orchestration;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orchestration orchestration  = new IndianOrchestration();
		Song indianSong = new IndianSong(orchestration);
		indianSong.perform();
		System.out.println(indianSong.toString());
	}

}
