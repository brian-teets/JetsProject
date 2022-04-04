package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AirField {
	private List<Jet> fleet; // variable name could also be called jets based on UML
	Scanner sc = new Scanner(System.in); 

	public AirField() {

		// TODO AirField constructor can call readFromFile method and pass in the txt
		// file
		fleet = new ArrayList<>();
		readFromFile("jets.txt");
	}

	public List<Jet> readFromFile(String fn) {
		try {
			BufferedReader bufIn = new BufferedReader(new FileReader(fn));
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] row = line.split(",");
				String typeOfJet = row[0];
				String model = row[1];
				double speed = Double.parseDouble(row[2]);
				int range = Integer.parseInt(row[3]);
				long price = Long.parseLong(row[4]);

				if (typeOfJet.equalsIgnoreCase("Passenger")) {
					Jet passengerJet = new Passenger(model, speed, range, price);
					fleet.add(passengerJet);
				} else if (typeOfJet.equalsIgnoreCase("CargoPlane")) {
					Jet cargoPlane = new CargoPlane(model, speed, range, price);
					fleet.add(cargoPlane);
				} else if (typeOfJet.equalsIgnoreCase("FighterJet")) {
					Jet fighterJet = new FighterJet(model, speed, range, price);
					fleet.add(fighterJet);
				} else if (typeOfJet.equalsIgnoreCase("DeepSpaceUFO")) {
					Jet UFO = new DeepSpaceUFO(model, speed, range, price);
					fleet.add(UFO);
				}

//				System.out.println(line); // for testing 
			}
			bufIn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fleet;
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	}

	public void listAllJets() {
		for (int i = 0; i < fleet.size(); i++) {

			System.out.print( i + 1 + ". " );
			System.out.print( fleet.get(i) );
			System.out.println();
		}
	}

	public void flyAllJets() {
		for (int i = 0; i < fleet.size(); i++) {
			fleet.get(i).fly();
		}
	}

	public void addAJetToFleet(List<Jet> fleet) {
		String model = null;
		double speed = 0.00;
		int range = 0;
		long price = 0;

		System.out.println("Enter the model name of aircraft you want to add: ");
		model = sc.nextLine();
		System.out.println("Enter speed: ");
		speed = sc.nextDouble();
		System.out.println("Enter the aircraft's range as a whole number: ");
		range = sc.nextInt();
		System.out.println("Please enter the price of the aircraft: ");
		price = sc.nextLong();

		Jet passengerJet = new Passenger(model, speed, range, price);
		fleet.add(passengerJet);
	}

	public void removeAJetFromFleet(List<Jet> fleet) {
		listAllJets();
		try {
			int removeChoice = 0;
			System.out.println();
			System.out.println("Enter the jet number that you want to remove from the list above. ");
			removeChoice = sc.nextInt();
			
			fleet.remove(removeChoice); 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public void viewFastestJet(List<Jet> fleet) {
		int fastestIndex = 0;
		for (Jet jet : fleet) {
			jet.getSpeed(); 
			if( jet.getSpeed() > fleet.get(fastestIndex).getSpeed()) {
				fastestIndex = fleet.indexOf(jet); 
			} 
		}
		System.out.println(fleet.get(fastestIndex)); 

	}

	public void viewJetWithLongestRange(List<Jet> fleet) { 
		int longestRange = 0;
		for (Jet jet : fleet) {
			jet.getRange();
			if( jet.getRange() > fleet.get(longestRange).getRange()) {
				longestRange = fleet.indexOf(jet);
			}
		}
		System.out.println( fleet.get(longestRange) ); 
	}

	public void loadAllCargoPlanes(List<Jet> fleet) {
		CargoPlane cP = new CargoPlane();
		
		for (Jet cargoPlane : fleet) {
			if( cargoPlane.getClass().equals(cP.getClass()) ) {
				(( CargoPlane ) cargoPlane).loadCargo(); 
			}
		}

	}

	public void callAllFighterJetsToFight(List<Jet> fleet) {

		FighterJet fJ = new FighterJet();

		for (Jet fighterJet : fleet) {
			if (fighterJet.getClass().equals(fJ.getClass())) {
				((FighterJet) fighterJet).fight();
			}
		}
	}

}
