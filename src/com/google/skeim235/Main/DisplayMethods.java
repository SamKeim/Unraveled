package com.google.skeim235.Main;

public class DisplayMethods {
	static int maxMenu;
	static int minProject;
	static int maxProject;
	static int projectListSize = Application.projectList.size();
	static int projectPages = getProjectPages();
	
	public static int getProjectPages() {
		int pages = Application.projectList.size() / 10;
		pages += (Application.projectList.size() % 10 == 0) ? 0 : 1;
		return pages;
	}
	
	public static void displayMenu() {
		System.out.println("================[ UNRAVELED MENU ]================");
		System.out.println("\t[1]\tAdd New Project");
		System.out.println("\t[2]\tModify Project");
		System.out.println("\t[3]\tComplete Project");
		System.out.println("\t[4]\tAdd DMC Color");
		System.out.println("\t[5]\tInfo");
		System.out.println("\t[0]\tExit");
		System.out.println("==================================================");
		maxMenu = 5;
	}
	
	public static void displayProjects(int start) {
		System.out.println("===== Projects =====");
		String name = "";
		for(int i = start; i < projectListSize && i < start + 10; i++) {
			name = Application.projectList.get(start).getName();
			System.out.println("[" + (i + 1) + "] " + name);
		}
		System.out.println("====================");
		minProject = start;
		maxProject = Math.min(start + 10, projectListSize);
	}
}
