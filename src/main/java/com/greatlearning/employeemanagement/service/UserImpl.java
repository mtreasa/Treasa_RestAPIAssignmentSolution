package com.greatlearning.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.User;
import com.greatlearning.employeemanagement.repository.UserRepository;

@Service
public class UserImpl implements UserInterface {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	@Transactional
	public User findById(int Id) {
		try {
			Object user = userRepository.findById(Id);
			return (User) user;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public User save(User theUser) {
		return userRepository.save(theUser);
	}

	@Override
	@Transactional
	public User deleteById(int theId) {
		Optional<User> employee = userRepository.findById(theId);
		userRepository.deleteById(theId);
		return employee.get();
	}

}
