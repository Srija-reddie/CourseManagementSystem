package com.CourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Object findByEmail(String email);

}
