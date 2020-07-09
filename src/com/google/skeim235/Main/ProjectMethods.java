package com.google.skeim235.Main;

import java.util.ArrayList;
import java.util.List;

public class ProjectMethods {

	
	public static void newProject() {
		// Prompt user to add a new project
		// Prompt for project name
		System.out.print("Enter Project Name: ");
		String projectName = GetMethods.getString();
		// Prompt for color list
		List<DMC> projectList = new ArrayList<>();
		DMC floss = null;
		do {
			try {
				floss = GetMethods.getValidDMC();
				if(floss != null) projectList.add(floss);
			} catch (IllegalArgumentException e) {
				System.out.println("No Such Color!");
			}
		} while (floss != null);
		
		// Print out color lists
		List<DMC> purchasedList = new ArrayList<>();
		List<DMC> shoppingList = new ArrayList<>();
		if(projectList.size() != 0) {
			for(int i = 0; i < projectList.size(); i++) {
				if(projectList.get(i).isPurchased()) {
					purchasedList.add(projectList.get(i));
				} else {
					shoppingList.add(projectList.get(i));
				}
			}
			DmcComparator c = new DmcComparator();
			purchasedList.sort(c);
			shoppingList.sort(c);
			System.out.println("==== Purchased Colors ====");
			
			for(int i = 0; i < purchasedList.size(); i++) {
				System.out.println(purchasedList.get(i));
			}
			System.out.println("==== Shopping List ====");
			for(int i = 0; i < shoppingList.size(); i++) {
				System.out.println(shoppingList.get(i));
			}
		}		
		// Prompt to add to project
		boolean start = false;
		boolean delete = false;
		while(!start && !delete) {
			start = GetMethods.getBoolean("Start Project? Y/N : ");
			if(start) {
				ProjectMethods.startProject(projectName, projectList);
				break;
			}
			delete = GetMethods.getBoolean("Delete Project? Y/N : ");
			if(delete) {
				purchasedList.clear();
				shoppingList.clear();
				projectList.clear();
				break;
			}
		}
		
	}
	
	public static void startProject(String projectName, List<DMC> projectList) {
		// set name
		// set start date
		// set DMC Floss to purchased
		// set DMC floss box to (ProjectName)
		// get URL source
		// get Description
		// get Notes
		Project newProject = new Project(projectName);
		for(int i = 0; i < projectList.size(); i++) {
			
		}
		
		
	}
}
