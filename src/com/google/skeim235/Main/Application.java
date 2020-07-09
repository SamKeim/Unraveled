package com.google.skeim235.Main;

import java.util.List;

import com.google.skeim235.Main.FileWriters.DMCLineConverter;

public class Application {
	public static List<DMC> dmcList = DMCLineConverter.dmcFromFiles();
	
	public static void main(String args[]) {

//		DisplayMethods.displayMenu();
//		
//		int userChoice = GetMethods.getUserChoice(DisplayMethods.maxMenu);
//		
//		while (userChoice != 0) {
//			switch(userChoice) {
//			case 1:
//				ProjectMethods.newProject();
//				break;
//			case 2:
//				System.out.println("Complete a project!");
//				break;
//			case 3:
//				System.out.println("Add a DMC Color!");
//				break;
//			default:
//				System.out.println("Remove a color from storage!");
//				break;
//			}
//			DisplayMethods.displayMenu();
//			userChoice = GetMethods.getUserChoice(DisplayMethods.maxMenu);
//		}
//		System.out.println("Thank you! Goodbye!");
//		DMCLineConverter.fileHelper.rewrite(dmcList);
	}
}
