package com.google.skeim235.Main.FileWriters;

import java.util.List;

import com.google.skeim235.Main.Project;

public class ProjectLineConverter implements LineConverter<Project> {
	public static FileHelper<Project> fileHelper = new FileHelper<>("Project.txt", (new ProjectLineConverter()));
	// creates means to send and retrieve information from DVDs.txt

	@Override
	public String toLine(Project object) { // takes dmc object and sets it to string to send to text file
		return String.format(
				"%s\t%s\t%s\t%s\t%s\t%s\t%s",
				object.getName(),
				object.getStatus(),
				object.getStartDate(),
				object.getEndDate(),
				object.getSource(),
				object.getDescription(),
				object.getNotes());
				
	}

	@Override
	public Project fromLine(String line) { // gets DMC object from line
		String[] lines = line.split("\t");
		return new Project(
				lines[0],
				lines[1],
				lines[2],
				lines[3],
				lines[4],
				lines[5],
				lines[6]
			);
	}
	
	public static List<Project> projectsFromFiles()
	{ // writes an array from the text file
		List<Project> projectList = fileHelper.readAll();
		return projectList;
	}

}