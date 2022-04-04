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
		double t = this.getRange() / this.getSpeed();
		System.out.printf(this.getModel() + " || Approximate flight time in hours: %.2f\n", t); 
//		System.out.println( this.getModel() + " || Approximate flight time:" + " " + (this.getRange() / this.getSpeed()) + " hours");
		System.out.println();
		
	} 
	
	

}
