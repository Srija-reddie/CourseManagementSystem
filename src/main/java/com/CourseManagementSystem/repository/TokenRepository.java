package com.CourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.entity.AuthenticationToken;
import com.CourseManagementSystem.entity.User;



public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer>  {

	AuthenticationToken findByToken(String token);

	AuthenticationToken findByUser(User user);
	

}
