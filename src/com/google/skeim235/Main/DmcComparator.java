package com.google.skeim235.Main;

import java.util.Comparator;

public class DmcComparator implements Comparator<DMC>{

	@Override
	public int compare(DMC o1, DMC o2) {
		return o1.getNumber().compareTo(o2.getNumber());
	}
}
