package com.CourseManagementSystem.dto;

public class CoursesDto {
	private long id;
	
	private String courseName;
	
	private String description;
	
	private String instructor;
	
	private int enrolledStudents;
	
	private int maxCapcity;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getEnrolledStudents() {
		return enrolledStudents;
	}
	public void setEnrolledStudents(int enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	public int getMaxCapcity() {
		return maxCapcity;
	}
	public void setMaxCapcity(int maxCapcity) {
		this.maxCapcity = maxCapcity;
	}

}
