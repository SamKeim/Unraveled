package com.google.skeim235.Main;

import java.util.ArrayList;
import java.util.List;

public class DMC {

	private String number;
	private String name;
	private String box;
	private List<Project> projects;
	private boolean purchased;
	private int bobbins;

	public DMC() {
		
	}
	
	public DMC(String number) {
		super();
		this.number = number;
	}
	public DMC(String number, String name, String box, String projects, boolean purchased, int bobbins) {
		super();
		this.number = number;
		this.name = name;
		this.box = box;
		this.setProjects(projects);
		this.purchased = purchased;
		this.bobbins = bobbins;

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void setProjects(String list) {
		this.projects = new ArrayList<Project>();
		if (list == null || list.equals("null")) {
			this.projects.add(new Project("null"));
		} else {
			list = list.substring(1, list.length() - 1);
			String[] arrayList = list.split(", ");
			for (String item : arrayList) {
				projects.add(new Project(item));
			}
		}
	}

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}

	public int getBobbins() {
		return bobbins;
	}

	public void setBobbins(int bobbins) {
		this.bobbins = bobbins;
	}

	/*
	 * DMC Pojo * Color number * Color name * Storage Box // null * Associated
	 * Projects // null * Boolean purchased * Number of Bobbins // null
	 */
	@Override
	public String toString() {
		if (purchased) {
			return String.format("%s\t%s\t%s\t%d", number, name, box, bobbins);
		} else {
			return String.format("%s\t%s\t", number, name);
		}
	}

	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o instanceof String) {
			return this.number.equalsIgnoreCase((new DMC((String) o)).getNumber());
		}
		if(!(o instanceof DMC)) return false;
		DMC comparator = (DMC) o;
		boolean isNumberValid = comparator.getNumber().equalsIgnoreCase(this.number);
		boolean isNameValid = comparator.getName().equalsIgnoreCase(this.name);
		
		return isNumberValid && isNameValid;
	}
	
//	@Override
//	public int compareTo(DMC compare) {
//		return 0;
//	}
}
