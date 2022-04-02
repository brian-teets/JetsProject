package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet; // variable name could also be called jets based on UML


	public AirField() {
	
		// TODO AirField constructor can call readFromFile method and pass in the txt
		// file
		fleet = new ArrayList<>();

		readFromFile("jets.txt");
	}

	public void readFromFile(String fn) {
		try {
			BufferedReader bufIn = new BufferedReader(new FileReader(fn));
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] row = line.split(",");
				
//				if(row[0].equals("Passenger")) {
//					Jet passenger1 = new Passenger(); 
//				}
				System.out.println(line);
			}
			bufIn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
