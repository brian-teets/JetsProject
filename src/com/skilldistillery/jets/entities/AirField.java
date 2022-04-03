package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet; // variable name could also be called jets based on UML

	public AirField() {

		// TODO AirField constructor can call readFromFile method and pass in the txt
		// file
		fleet = new ArrayList<>();
		readFromFile("jets.txt");
//		writeToFile();
	}

	public void readFromFile(String fn) {
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
	}

//	public void writeToFile(Writer fn) {
//		try {
//			BufferedWriter writer = new BufferedWriter( new FileWriter("jets2.txt") );
//			writer.write("Test output text"); 
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public void removeFromFile() {  // do I even need this method? do i need to remove or change anything directly on the txt file?

	}

	public void listAllJets() {
		// will use array list get method?   like, fleet.get(); ? 
	}

	public void addAJetToFleet() {
		// fleet.add(  pass in a new Jet object?  ) ?
	}
	
	public void removeAJetFromFleet() {
		// call fleet.remove(  what do i pass in as an argument?  ) ?
	} 
	
	public void flyAllJets() {
		// from fleet of all Jet objects, call Jet.fly() ? I don't know if this would work or makes sense.
	}

	public void viewFastestJet() {
		// will use Jet.getSpeed? and will need a min max type comparison expression

	}

	public void viewJetWithLongestRange() {
		// will use Jet.getRange? and will need a min max type comparison expression

	}

	public void loadAllCargoPlanes() {
		// from fleet of all Jet objects, get typeOfJet.equals("CargoPlane") ? 

	}

	public void callAllFighterJetsToFight() {
		// from fleet of all Jet objects, get typeOfJet.equals("FighterJet") ? 
	}

}
