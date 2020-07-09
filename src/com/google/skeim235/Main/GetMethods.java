package com.google.skeim235.Main;

import java.util.List;
import java.util.Scanner;

public class GetMethods {
	public static Scanner scn = new Scanner(System.in);
	
	public static String getString() {
		return scn.nextLine();
	}
	
	public static boolean getBoolean(String prompt) {
		boolean valid = false;
		char answer = 'n';

		while (!valid){
			System.out.print(prompt);
			answer = scn.next().toUpperCase().charAt(0);
			valid = answer == 'Y' || answer == 'N';
			if(!valid) System.out.println("Please enter Y or N.");
		} while (!valid);
		return answer == 'Y';
	}
	
	public static int getUserChoice(int maxIndex) {
		System.out.print("Selection: ");
		while(!scn.hasNextInt()) {
			System.out.print("Invalid.\nSelection:");
			scn.nextLine();
		}
		int choice = scn.nextInt();
		
		// VALIDATE BASED ON MENU OPTIONS
		boolean valid = choice >= 0 && choice <= maxIndex;
		if(!valid) {
			System.out.print("Invalid.\nSelection: ");
			choice = getUserChoice(maxIndex);				
		}
		
		return choice;
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static DMC getValidDMC() throws IllegalArgumentException {
		System.out.print("Enter Color Number (0 = Exit): ");
		String choice = scn.next();
		try {
			if(Integer.parseInt(choice) == 0) return null;
		} catch (NumberFormatException e) {
//			e.printStackTrace();
		}
		for(int i = 0; i < Application.dmcList.size(); i++) {
			if (Application.dmcList.get(i).equals(choice)) {
				return Application.dmcList.get(i);
			}
		}
		throw new IllegalArgumentException();
	}
	
	public static List<DMC> getDMCList(){
		System.out.println("Enter list of DMC Colors.");
		
		return null;
	}
}
