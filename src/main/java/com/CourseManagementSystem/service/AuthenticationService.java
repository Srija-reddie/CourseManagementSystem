package com.CourseManagementSystem.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseManagementSystem.entity.AuthenticationToken;
import com.CourseManagementSystem.entity.User;
import com.CourseManagementSystem.repository.TokenRepository;
import com.CourseManagementSystem.exceptions.AuthenticationFailException;



@Service
public class AuthenticationService {

    @Autowired
    TokenRepository tokenRepository;

    public void saveConfirmationToken(AuthenticationToken authenticationToken) {
        tokenRepository.save(authenticationToken);
    }

    public AuthenticationToken getToken(User user) {
        return tokenRepository.findByUser(user);
    }


    public User getUser(String token) {
        final AuthenticationToken authenticationToken = tokenRepository.findByToken(token);
    
        if(Objects.isNull(authenticationToken)) {
            return null;
        }
        // authenticationToken is not null
        return authenticationToken.getUser();
    }

    public void authenticate(String token) throws AuthenticationFailException {
        // null check
        if(Objects.isNull(token)) {
            // throw an exception
            throw new AuthenticationFailException("token not present");
        }
        if(Objects.isNull(getUser(token))) {
            throw new AuthenticationFailException("token not valid");
        }
    }
}