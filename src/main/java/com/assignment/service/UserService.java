package com.assignment.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.assignment.model.User;
import com.assignment.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
