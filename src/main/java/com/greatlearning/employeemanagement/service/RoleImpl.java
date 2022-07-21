package com.greatlearning.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.Role;
import com.greatlearning.employeemanagement.repository.RoleRepository;

@Service
public class RoleImpl implements RoleInterface {

	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public List<Role> findAll() {
		List<Role> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	@Transactional
	public Role findById(int Id) {
		try {
			Object role = roleRepository.findById(Id);
			return (Role) role;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public Role save(Role theRole) {
		return roleRepository.save(theRole);
	}

	@Override
	@Transactional
	public Role deleteById(int theId) {
		Optional<Role> role = roleRepository.findById(theId);
		roleRepository.deleteById(theId);
		return role.get();
	}

}
