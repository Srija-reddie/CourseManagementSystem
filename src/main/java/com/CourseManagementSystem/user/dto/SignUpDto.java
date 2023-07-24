package com.CourseManagementSystem.user.dto;

import java.util.List;

import com.CourseManagementSystem.entity.UserRole;

public class SignUpDto {
	 private Long id;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    List<UserRole> userRole;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<UserRole> getUserRole() {
			return userRole;
		}
		public void setUserRole(List<UserRole> userRole) {
			this.userRole = userRole;
		}
	    
	   
		
}
