package com.CourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CourseManagementSystem.dto.CoursesDto;
import com.CourseManagementSystem.entity.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

	

}
