package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	
	private AirField aF = new AirField(); // creates a new AirField object 
	Scanner scanner = new Scanner(System.in);

	public JetsApplication(AirField airField, Scanner scanner) {
		this.aF = airField;
		this.scanner = scanner;
	}

	public JetsApplication() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication(); 
		

		jetsApp.launch(); 

		
	} // end of main

	private void launch() {
		
		displayUserMenu();

		scanner.close(); // not quite sure where in the class to close the scanner 

	} // end of launch method

	public void displayUserMenu() { 

		String keepGoing = "Y";
		
		while (keepGoing.toUpperCase().equals("Y")) {
			System.out.println();
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

			try {
				int userMenuChoice = scanner.nextInt(); 
				switch (userMenuChoice) {
				case 1:
					aF.listAllJets();
					break;
				case 2:
					aF.flyAllJets();
					break;
				case 3:
					aF.viewFastestJet(aF.getFleet()); 
					break;
				case 4:
					aF.viewJetWithLongestRange(aF.getFleet());
					break;
				case 5:
					aF.loadAllCargoPlanes(aF.getFleet()); 
					break;
				case 6:
					// Dogfight menu option
					aF.callAllFighterJetsToFight(aF.getFleet()); 
					break;
				case 7:
					aF.addAJetToFleet();
					break;
				case 8:
					aF.removeAJetFromFleet();
					break;
				case 9:
					System.out.println("==You chose to quit the application==");
					System.out.println("==============Goodbye!===============");
					keepGoing = "N";
					break;
				}
			} 
			catch (InputMismatchException e) {
				System.err.println("Invalid input. Expected a number input between 1 and 9. You entered something else!");
				System.out.println("Please enter a valid option from the menu.");
				System.out.println(); 
				scanner.nextLine();
				System.out.println("Return to main menu? (Y/N)"); 
				keepGoing = scanner.nextLine(); 
				if(keepGoing.toUpperCase().equals("Y")) {
					keepGoing = "Y";
				}
				else if(keepGoing.toUpperCase().equals("N")){
					System.out.println("==============Goodbye!===============");
					keepGoing = "N";
				} 
			} 
			
		} 

	} // end of displayUserMenu method
	
}
