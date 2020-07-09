package com.google.skeim235.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjectMethods {

	
	public static void newProject() {
		// Prompt user to add a new project
		// Prompt for project name
		String projectName = GetMethods.getString("Enter Project Name: ");
		
		// Prompt for color list
		List<DMC> projectList = ProjectMethods.getDmcList();
		
		// Split and print out color lists
		// Check if list is 0, exit
		if(projectList.size() == 0) return;
		// get purchased list
		List<DMC> purchasedList = ProjectMethods.getPurchasedList(projectList);
		// get shopping list
		List<DMC> shoppingList = ProjectMethods.getShoppingList(projectList);
		
		// print lists
		if(purchasedList.size() != 0) {
			System.out.println("==== Purchased Colors ====");
			for(int i = 0; i < purchasedList.size(); i++) {
				System.out.println(purchasedList.get(i));
			}
		}
		if(shoppingList.size() != 0) {
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
	
	public static List<DMC> getShoppingList(List<DMC> projectList){
		List<DMC> shoppingList = new ArrayList<>();
		if(projectList.size() != 0) {
			for(int i = 0; i < projectList.size(); i++) {
				if(projectList.get(i).getBobbins() == 0) {
					shoppingList.add(projectList.get(i));
				}
			}

		}		
		return shoppingList;
	}
	
	public static List<DMC> getPurchasedList(List<DMC> projectList){
		List<DMC> purchasedList = new ArrayList<>();
		for(int i = 0; i < projectList.size(); i++) {
			if(projectList.get(i).getBobbins() != 0) {
				purchasedList.add(projectList.get(i));
			}
		}
		return purchasedList;
	}
	
	
	public static List<DMC> getDmcList(){
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
		DmcComparator c = new DmcComparator();
		projectList.sort(c);
		return projectList;
	}
	
	public static void startProject(String projectName, List<DMC> projectList) {
		// set name
		Project newProject = new Project(projectName);
		
		// set start date
		newProject.setStartDate(LocalDate.now());
		
		for(int i = 0; i < projectList.size(); i++) {
			// set DMC Floss to purchased
			if(projectList.get(i).getBobbins() == 0) projectList.get(i).setBobbins(1);

			// set DMC floss box to (ProjectName)		
			projectList.get(i).setBox(projectName);
		}
		
		// get URL source
		newProject.setSource(GetMethods.getString("Enter pattern source: "));
		
		// get Description
		newProject.setDescription(GetMethods.getString("Enter project description: "));
		
		// Set status
		newProject.setStatus("In Progress");
		
		Application.projectList.add(newProject);
	}
	
	public static void updateProject() {
		
		// list projects, ask for user to select project to update
		DisplayMethods.displayProjects(0);
		
		// get user selection
		String userSelection = GetMethods.getPageSelection(DisplayMethods.minProject, DisplayMethods.maxProject);
		if(userSelection.equals("N")) {
			DisplayMethods.displayProjects(DisplayMethods.maxProject + 1);
		} else if(userSelection.equals("P")) {
			DisplayMethods.displayProjects(DisplayMethods.minProject - 10);
		}
		
		
		// prompt user to update [1] status or [2] add note
		// update status
		// add note
		
	}
}
