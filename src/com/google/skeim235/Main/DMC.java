package com.google.skeim235.Main;

public class DMC {

	private String number;
	private String name;
	private String box;
	private int bobbins;

	public DMC() {
		
	}
	
	public DMC(String number) {
		super();
		this.number = number;
	}
	public DMC(String number, String name, String box, int bobbins) {
		super();
		this.number = number;
		this.name = name;
		this.box = box;
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

	public int getBobbins() {
		return bobbins;
	}

	public void setBobbins(int bobbins) {
		this.bobbins = bobbins;
	}

	@Override
	public String toString() {
		if (bobbins != 0) {
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

}
