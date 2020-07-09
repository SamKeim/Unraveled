package com.google.skeim235.Main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Project {
	private String name;
	private String status; // CHANGE TO ENUM LATER
	private LocalDate startDate;
	private LocalDate endDate;
	private String source; // URL
	private String description; // brief description of project
	private List<String> notes; // room for more detailed notes

	public Project() {
	}
	
	public Project(String name) {
		this.name = name;
	}
	
	public Project(
			String name,
			String status,
			String startDate,
			String endDate,
			String source,
			String description,
			String notes
			) {
		
		
		this.name = name;
		this.status = status;
		setStartDate(startDate);
		setEndDate(endDate);
		this.setSource(source);
		this.description = description;
		setNotes(notes);
	}
	
	public void setStartDate(String startDate) {
		String[] arr = startDate.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int dayOfMonth = Integer.parseInt(arr[2]);
		this.startDate = LocalDate.of(year, month, dayOfMonth);
	}
	
	public void setEndDate(String endDate) {
		if(endDate.equals("null")) {
			endDate = "null";
		} else {
			String[] arr = endDate.split("-");
			int year = Integer.parseInt(arr[0]);
			int month = Integer.parseInt(arr[1]);
			int dayOfMonth = Integer.parseInt(arr[2]);
			this.endDate = LocalDate.of(year, month, dayOfMonth);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getNotes() {
		return notes;
	}
	
	public String getNoteString() {
		StringBuilder sb = new StringBuilder();
		for(String s : notes) {
			sb.append(s);
			sb.append("/*/");
		}
		return sb.toString();
	}

	public void setNotes(String notes) {
		notes = notes.substring(1,notes.length() - 1);
		this.notes = Arrays.asList(notes.split("/*/"));
	}
	
	public void addNote(String note) {
		note = LocalDate.now().toString() + " " + note;
		notes.add(note);
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
