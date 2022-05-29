package com.example.urban.FinalProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urban.FinalProject.Services.UserService;




import com.example.urban.FinalProject.bean.Users;

@RestController
@CrossOrigin(origins="http://localhost:3000")

@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	
	
	@PostMapping("/signup")
	public boolean signUp(@RequestBody Users user ) {
		return userService.signUp(user.getFullname(), user.getEmail(), user.getAddress(), user.getPassword());
	}
	@GetMapping("/login/{email}/{password}")
	public long login(@PathVariable String email, @PathVariable String password)
	{
		return userService.login(email,password);

	}
}
