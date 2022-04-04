package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {
	
	
	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void fight() {
		
		System.out.println( this.getModel() + " || " + " Attack initiated! " + " ***PEW-PEW*** " + " ***PEW-PEW*** " + " ***PEW-PEW*** "); 
		System.out.println();
		
	}

	@Override
	public void fly() {
		double t = this.getRange() / this.getSpeed();
		System.out.printf(this.getModel() + " || Approximate flight time in hours: %.2f\n", t); 
//		System.out.println( this.getModel() + " || Approximate flight time:" + " " + (this.getRange() / this.getSpeed()) + " hours");
		System.out.println();
	}
	

}
