package com.CourseManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {
	@Id
	@Column(name="courseid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="courseName")
	private String courseName;
	@Column(name="description")
	private String description;
	@Column(name="instructor")
	private String instructor;
	@Column(name="enrolledStudents")
	private int enrolledStudents;
	@Column(name="maxCapcity")
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
	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", description=" + description + ", instructor="
				+ instructor + ", enrolledStudents=" + enrolledStudents + ", maxCapcity=" + maxCapcity + "]";
	}
	
	

}

 