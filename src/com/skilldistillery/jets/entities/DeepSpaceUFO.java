package com.skilldistillery.jets.entities;

public class DeepSpaceUFO extends Jet implements UFO {

	public DeepSpaceUFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeepSpaceUFO(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cloaking() {
		System.out.println( " ===== Whoa, where'd that thing go? It just disappeared! ===== " ); 
		
	}

	@Override
	public void fly() {
		System.out.println("UFO goes: Whoosh. Whoosh. Whoosh. ");
		
	} 
	
	

}
