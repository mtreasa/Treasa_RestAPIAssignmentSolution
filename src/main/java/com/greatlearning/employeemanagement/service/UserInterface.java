package com.greatlearning.employeemanagement.service;

import java.util.List;

import com.greatlearning.employeemanagement.entity.User;

public interface UserInterface {
	

	public List<User> findAll();
	
	public User findById(int Id);
	
	public User save(User theUser);

	public User deleteById(int theId);
	

}
