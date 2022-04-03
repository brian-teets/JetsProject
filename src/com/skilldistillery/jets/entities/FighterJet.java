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
		
		for(int i = 0; i < 3; i ++ ) {
			System.out.print( "PEW-PEW!" );
		} 
		
	}

	@Override
	public void fly() {
		System.out.println("Fighter Jet goes: ZoooooM!");
//		   /\
//		   \ \
//		    \ \
//		    /  \
//		   <===>\
//		   <    )>
//		   <===>/
//		    \  /
//		    / /
//		   / /
//		   \/

		
		//https://asciiart.website/index.php?art=transportation/airplanes

	}
	

}
