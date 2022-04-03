package com.skilldistillery.jets.entities;

public class Passenger extends Jet {

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// speed in MPH, range in miles, price in US dollars
	}

	@Override
	public void fly() {
		System.out.println( this.getModel() + " || Approximate flight time: " + " " + (this.getRange() / this.getSpeed()) + " hours");
		System.out.println();
	}
	
	
}
