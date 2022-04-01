package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class AirField {
	private List<Jet> fleet; // variable name could also be called jets based on UML

	public AirField() {
		super();

	}

	public AirField(List<Jet> fleet) {
		this.fleet = fleet;
		// TODO AirField constructor can call readFromFile method and pass in the txt
		// file

		readFromFile("jets.txt");
	}

	public void readFromFile(String fn) {
		try {
			BufferedReader bufIn = new BufferedReader(new FileReader(fn));
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] row = line.split(",");
			}
			bufIn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
