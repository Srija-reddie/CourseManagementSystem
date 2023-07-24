package com.CourseManagementSystem.entity;

import org.springframework.security.core.GrantedAuthority;


	public enum UserRole implements GrantedAuthority {
		  ROLE_ADMIN, ROLE_User;

		  public String getAuthority() {
		    return name();
		  }

		}



