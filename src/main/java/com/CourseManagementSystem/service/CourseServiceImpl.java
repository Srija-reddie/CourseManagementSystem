package com.CourseManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.CourseManagementSystem.dto.CoursesDto;
import com.CourseManagementSystem.entity.Courses;
import com.CourseManagementSystem.repository.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public Courses createCourse(CoursesDto courseDto) {
		
		Courses course=new Courses();
		course.setCourseName(courseDto.getCourseName());
		course.setDescription(courseDto.getDescription());
		course.setEnrolledStudents(courseDto.getEnrolledStudents());
		course.setInstructor(courseDto.getInstructor());
		course.setMaxCapcity(courseDto.getMaxCapcity());
		// TODO Auto-generated method stub
		
		return courseRepository.save(course);
	}

	private void save(Courses course) {
		// TODO Auto-generated method stub
		
	}

	public List<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	public Optional<Courses> getCourseById(Long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id);
	}

	public Optional<Courses> updateCourseById(Long id, CoursesDto courseDto) {
		// TODO Auto-generated method stub
		Optional<Courses> course=courseRepository.findById(id);
		if(course.isPresent()) {
			course.get().setCourseName(courseDto.getCourseName());
			course.get().setDescription(courseDto.getDescription());
			course.get().setEnrolledStudents(courseDto.getEnrolledStudents());
			course.get().setInstructor(courseDto.getInstructor());
			course.get().setMaxCapcity(courseDto.getMaxCapcity());
			courseRepository.save(course.get());
			
		}
		 
		return course;
	}

	public String deleteById(Long id, CoursesDto coursesDto) {
		if(courseRepository.existsById(id)) {
			courseRepository.deleteById(id);
			return "course deleted succesfully";
		}
		// TODO Auto-generated method stub
		else
		return "course is not available";
	}

	
	

	


	



}
