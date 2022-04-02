package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		JetsApplication jetsApp = new JetsApplication();

		jetsApp.displayUserMenu(scanner); 
		
		jetsApp.launch();
	
		scanner.close(); 
	} // end of main

	public void launch() {

		AirField a = new AirField(); // creates a new AirField object

	} // end of launch method

	public void displayUserMenu(Scanner choice) {

		try {
			int userMenuChoice = choice.nextInt(); 
			boolean keepGoing = true;
			while (keepGoing) {
				System.out.println("Please choose from the following menu: ");
				System.out.println();
				System.out.println("1 List all aircraft in fleet");
				System.out.println("2 Fly all aircraft");
				System.out.println("3 View fastest aircraft");
				System.out.println("4 View jet with longest range");
				System.out.println("5 Load all Cargo Jets"); // needs to call loadCargo() method on all existing CargoPlane
																// objects
				System.out.println("6 Dogfight! ");
				System.out.println("7 Add an aircraft to the fleet");
				System.out.println("8 Remove an aircraft from the fleet");
				System.out.println("9 Quit");
				System.out.println();
				if (userMenuChoice == 9) {
					keepGoing = false;
				} 
				if (userMenuChoice == 1) {
					
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	} // end of displayUserMenu method

}
