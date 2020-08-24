package com.sportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyShoes.model.User;
import com.sportyShoes.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class UserController {
    
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		return userservice.createUser(user);
	}

    @GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userservice.getAllUsers();
	}
    
    @DeleteMapping(value = "/user/{userId}")
    public void deleteByUserId(@PathVariable int userId) {
    	userservice.deleteByUserId(userId);
    }
    
    @GetMapping(value = "/user/{userId}")
    public User findByUserId(@PathVariable int userId) {
    	
    	return userservice.findByUserId(userId);
    }
    
    @PutMapping("/user")
    public User updateByUserId(@RequestBody User user) {
    	
    	return userservice.updateUser(user);
    }

}
