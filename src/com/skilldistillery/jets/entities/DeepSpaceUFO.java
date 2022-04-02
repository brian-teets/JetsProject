package com.skilldistillery.jets.entities;

public class DeepSpaceUFO extends Jet implements UFO {

	@Override
	public void cloaking() {
		System.out.println( "Observer: " + " Whoa, where'd that thing go? It just disappeared! " ); 
		
	}

}
