package com.CourseManagementSystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class User {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "firstName")
	    private String firstName;
	    

	    @Column(name = "lastName")
	    private String lastName;
	    

	    @Column(name = "email")
	    private String email;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "userRole")
	    @ElementCollection(fetch = FetchType.EAGER)
	    private List<UserRole> userRole;

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

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", password=" + password + ", userRole=" + userRole + "]";
		}

		public User(Long id, String firstName, String lastName, String email, String password,
				List<UserRole> userRole) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.userRole = userRole;
		}
		
		
	    
}


	   