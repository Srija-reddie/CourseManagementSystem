package com.CourseManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagementSystem.dto.ResponseDto;
import com.CourseManagementSystem.entity.User;
import com.CourseManagementSystem.repository.UserRepository;
import com.CourseManagementSystem.service.UserService;
import com.CourseManagementSystem.user.dto.SignInDto;
import com.CourseManagementSystem.user.dto.SignInResponseDto;
import com.CourseManagementSystem.user.dto.SignUpDto;




	@RestController
	public class UserController {

	    @Autowired
	    UserService userService;
	    
	    @Autowired
	    UserRepository userRepository;

	    // create user
	    @PostMapping
		public User createUser(@RequestBody User user) {
			return userService.save(user);
		}

	    // signup

	    @PostMapping("/signup")
	    public ResponseDto signup(@RequestBody SignUpDto signupDto) {
	        return userService.signUp(signupDto);
	    }


	    // signin

	    @PostMapping("/signin")
	    public SignInResponseDto signIn(@RequestBody SignInDto signInDto) {
	        return userService.signIn(signInDto);
	    }


	}
	
	
	
	


