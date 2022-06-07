package net.javaguides.springboot.service;

import net.javaguides.springboot.service.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.model.User;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}