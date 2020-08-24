package com.sportyShoes.service;

import java.util.List;

import com.sportyShoes.model.User;

public interface UserService {

	public User createUser(User user);
	public List<User> getAllUsers();
	public void deleteByUserId(int userId);
	public User findByUserId(int userId);
	public User updateUser(User user);
		
}
