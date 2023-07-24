package com.CourseManagementSystem.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseManagementSystem.dto.ResponseDto;
import com.CourseManagementSystem.entity.User;
import com.CourseManagementSystem.exceptions.CustomException;
import com.CourseManagementSystem.repository.UserRepository;
import com.CourseManagementSystem.user.dto.SignInDto;
import com.CourseManagementSystem.user.dto.SignInResponseDto;
import com.CourseManagementSystem.user.dto.SignUpDto;
import com.clorev.service.app.service.AuthenticationService;


@Service
public class UserService  {

	@Autowired
    UserRepository userRepository;
	@Autowired
    AuthenticationService authenticationService;

    

	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
		
	}
    
	@Transactional
	public ResponseDto signUp(SignUpDto signupDto) {
		// TODO Auto-generated method stub
        if (Objects.nonNull(userRepository.findByEmail(signupDto.getEmail()))) {
            // we have an user
            throw new CustomException("user already present");
        }


        // hash the password

        String encryptedpassword = signupDto.getPassword();

        try {
            encryptedpassword = hashPassword(signupDto.getPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        User user = new User(signupDto.getId(), signupDto.getFirstName(), signupDto.getLastName(),
                signupDto.getEmail(), encryptedpassword);

        userRepository.save(user);

        // save the user

        // create the token

        final AuthenticationService authenticationToken = new AuthenticationService(user);

        authenticationService.saveConfirmationToken(authenticationToken);

        ResponseDto responseDto = new ResponseDto("success", "user created succesfully");
        return responseDto;
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String hash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();
        return hash;
	}

	public SignInResponseDto signIn(SignInDto signInDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
