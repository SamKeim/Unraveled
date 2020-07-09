package com.google.skeim235.Main;

public class DisplayMethods {
	static int maxMenu;
	public static void displayMenu() {
		/* Menu capabilities
		 * 	* Add Project
		 * 		* Takes in List Of Colors
		 * 		* Validates Colors against Master
		 * 		* Returns Two Lists
		 * 			* Colors Needed (Shopping List)
		 * 			* Colors Owned
		 * 		* Prompts user to add project or cancel
		 * 		* Saves shopping list as owned, moves all colors to "Project Name" box
		 * 	* Add DMC color to Master List
		 * 	* Remove color from storage (Ran out)
		 */
		System.out.println("================[ UNRAVELED MENU ]================");
		System.out.println("\t[1]\tAdd New Project");
		System.out.println("\t[2]\tComplete Project");
		System.out.println("\t[3]\tAdd DMC Color");
		System.out.println("\t[4]\tRemove from Inventory");
		System.out.println("\t[0]\tExit");
		System.out.println("==================================================");
		maxMenu = 4;
	}
}
