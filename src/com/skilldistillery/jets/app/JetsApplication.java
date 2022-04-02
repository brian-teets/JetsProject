package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	public static void main(String[] args) {

		JetsApplication jetsApp = new JetsApplication();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose from the following menu: ");

		try {
			jetsApp.displayUserMenu();

			int userMenuChoice = scanner.nextInt();
			boolean keepGoing = true;
			while (keepGoing) {
				if (userMenuChoice == 9) {
					keepGoing = false;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jetsApp.launch();

	} // end of main

	public void launch() {

		AirField a = new AirField(); // creates a new AirField object

	} // end of launch method

	public void displayUserMenu() {

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

	} // end of displayUserMenu method

}
