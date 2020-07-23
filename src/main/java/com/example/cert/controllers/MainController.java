package com.example.cert.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cert.model.User;
import com.example.cert.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
	
	private  UserService userService;
@GetMapping("/hello/{id}")
public User sayHello(@PathVariable Long id) {
	return userService.getUser(id);
}

}
