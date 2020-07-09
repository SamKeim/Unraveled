package com.google.skeim235.Main;

import java.util.List;
import java.util.Scanner;

public class GetMethods {
	public static Scanner scn = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		return scn.nextLine();
	}
	
	public static boolean getBoolean(String prompt) {
		boolean valid = false;
		char answer = 'n';

		while (!valid){
			System.out.print(prompt);
			answer = scn.next().toUpperCase().charAt(0);
			scn.nextLine();
			valid = answer == 'Y' || answer == 'N';
			if(!valid) System.out.println("Please enter Y or N.");
		} while (!valid);
		return answer == 'Y';
	}
	
	public static String getPageSelection(int minIndex, int maxIndex) {
		String response = "";
		int selection = 0;
		boolean valid = false;
		
		
		
		
		
		
		
		
		
		
		/// VALIDATE AVAILABILITY OF NEXT OR PREVIOUS PAGE AND ALTER
		System.out.print("[N] Next, [P] Previous, or [#] Line: ");
		
		
		
		
		
		
		
		
		
		do {
			if(scn.hasNextInt()) {
				selection = scn.nextInt();
				scn.nextLine();
				if(selection >= minIndex && selection <= maxIndex) {
					response = Integer.toString(selection);
					valid = true;
				}
			} else {
				response = scn.nextLine().toUpperCase();
				if(response.startsWith("N") || response.startsWith("P")) {
					response = response.substring(0, 1);
					valid = true;
				}
			}
			if(!valid)
				System.out.println("Invalid. Try again.");
			System.out.println(response);
		} while (!valid);
		return response;
	}

	public static int getUserChoice(int maxIndex) {
		return getUserChoice(0, maxIndex);
	}
	
	public static int getUserChoice(int minIndex, int maxIndex) {
		System.out.print("Selection: ");
		while(!scn.hasNextInt()) {
			System.out.print("Invalid.\nSelection:");
			scn.nextLine();
		}
		int choice = scn.nextInt();
		
		// VALIDATE BASED ON MENU OPTIONS
		boolean valid = choice >= minIndex && choice <= maxIndex;
		if(!valid) {
			System.out.print("Invalid.\nSelection: ");
			choice = getUserChoice(minIndex, maxIndex);				
		}
		scn.nextLine();
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
