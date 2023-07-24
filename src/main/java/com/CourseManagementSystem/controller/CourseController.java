package com.CourseManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagementSystem.dto.CoursesDto;
import com.CourseManagementSystem.entity.Courses;
import com.CourseManagementSystem.repository.CourseRepository;
import com.CourseManagementSystem.service.CourseServiceImpl;
import com.fasterxml.jackson.annotation.JsonAnyGetter;


@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	  @GetMapping("/admin")
	    public String adminHome(){
	        return "adminHome";
	    }
	
	
	@PostMapping("/admin/addcourses")
	public ResponseEntity<String> createCourse(@RequestBody CoursesDto courseDto){
		System.out.println("create method started");
		
		Courses createdCourse=courseServiceImpl.createCourse(courseDto);
		return new ResponseEntity<String>(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/admin/getAllCourses")
	public List<Courses> getAllCourses(){
	return courseServiceImpl.getAllCourses();

}
	
	@GetMapping("admin/getCourse/{id}")
		public Optional<Courses> getCourseById(@PathVariable Long id) {
			return courseServiceImpl.getCourseById(id);
			
	}
	@PutMapping("admin/updateCourse/{id}")
	public Optional<Courses> updateCourseById(@PathVariable Long id,CoursesDto coursesDto){
		return courseServiceImpl.updateCourseById(id,coursesDto);
	
	}
	@DeleteMapping("admin/deleteCourse/{id}")
		public String deleteById(@PathVariable Long id,CoursesDto coursesDto) {
		return courseServiceImpl.deleteById(id,coursesDto);
	}
	}

