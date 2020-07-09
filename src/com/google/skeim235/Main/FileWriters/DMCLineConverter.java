package com.google.skeim235.Main.FileWriters;

import java.util.List;

import com.google.skeim235.Main.DMC;

public class DMCLineConverter implements LineConverter<DMC> {
	public static FileHelper<DMC> fileHelper = new FileHelper<>("Floss.txt", (new DMCLineConverter()));
	// creates means to send and retrieve information from DVDs.txt

	@Override
	public String toLine(DMC object) { // takes dmc object and sets it to string to send to text file
		return String.format(
				"%s\t%s\t%s\t%d",
				object.getNumber(),
				object.getName(),
				object.getBox(),
				object.getBobbins());
	}

	@Override
	public DMC fromLine(String line) { // gets DMC object from line
		String[] lines = line.split("\t");
		if(lines.length == 2) {
			return new DMC(
					lines[0],
					lines[1],
					"null",
					0
					);
		} else {
			return new DMC(
					lines[0],
					lines[1],
					lines[2],
					Integer.parseInt(lines[3])
					);
			
		}
	}
	
	public static List<DMC> dmcFromFiles()
	{ // writes an array from the text file
		List<DMC> dmcList = fileHelper.readAll();
		return dmcList;
	}

}