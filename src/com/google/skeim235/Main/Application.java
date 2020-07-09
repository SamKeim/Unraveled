package com.google.skeim235.Main;

import java.util.List;

import com.google.skeim235.Main.FileWriters.DMCLineConverter;
import com.google.skeim235.Main.FileWriters.ProjectLineConverter;

public class Application {
	public static List<DMC> dmcList = DMCLineConverter.dmcFromFiles();
	public static List<Project> projectList = ProjectLineConverter.projectsFromFiles();
	
	public static void main(String args[]) {
		
		DisplayMethods.displayProjects(15);
		System.out.println(GetMethods.getPageSelection(15, 22));
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
//				System.out.println("Modify a project!");
//				break;
//			case 3:
//				System.out.println("Complete a project!");
//				break;
//			case 4:
//				System.out.println("Add a DMC Color!");				
//			default:
//				System.out.println("README!");
//				break;
//			}
//			DisplayMethods.displayMenu();
//			userChoice = GetMethods.getUserChoice(DisplayMethods.maxMenu);
//			DMCLineConverter.fileHelper.rewrite(dmcList);
//			ProjectLineConverter.fileHelper.rewrite(projectList);
//
//		}
//		System.out.println("Thank you! Goodbye!");
//		DMCLineConverter.fileHelper.rewrite(dmcList);
//		ProjectLineConverter.fileHelper.rewrite(projectList);
	}
}
