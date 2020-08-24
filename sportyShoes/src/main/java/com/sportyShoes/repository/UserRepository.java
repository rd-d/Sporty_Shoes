package com.sportyShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyShoes.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public void deleteByUserId(int userId); 
	public User findByUserId(int userId);
}
