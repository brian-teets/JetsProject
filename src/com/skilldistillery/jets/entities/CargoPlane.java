package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	
	
	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println();
		System.out.println("===beginning loading cargo===");
		System.out.println("====still loading cargo====");
		System.out.println();
		System.out.println("===this stuff is heavy, you guys!===");
		System.out.println("=======done loading cargo======");
		System.out.println(); 
	}

}
