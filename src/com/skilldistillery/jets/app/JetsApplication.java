package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	
	private AirField aF = new AirField(); // creates a new AirField object 
	private Scanner scanner = new Scanner(System.in);

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

//		scanner.close(); // not quite sure where in the class to close the scanner 
	} // end of main

	private void launch() {
		
		displayUserMenu();


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
					System.out.println("PLACEHOLDER FOR OPTION 3: METHOD CALL TO DISPLAY FASTEST AIRCRAFT");
					break;
				case 4:
					System.out.println("PLACEHOLDER FOR OPTION 4: METHOD CALL TO DISPLAY JET WITH LONGEST RANGE");
					break;
				case 5:
					System.out.println("PLACEHOLDER FOR OPTION 5: SPECIALIALIZED METHOD CALL - LOAD ALL CARGO PLANES ");
					break;
				case 6:
					System.out.println(
							"PLACEHOLDER FOR OPTION 6: SPECIALIALIZED METHOD CALL - MAKE ALL FIGHTER JETS PERFORM FIGHT METHOD BEHAVIOR");
					break;
				case 7:
					System.out.println("PLACEHOLDER FOR OPTION 7: METHOD CALL TO ADD AN AIRCRAFT TO THE FLEET");
					break;
				case 8:
					System.out.println("PLACEHOLDER FOR OPTION 8: METHOD CALL TO REMOVE AN AIRCRAFT FROM THE FLEET");
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
