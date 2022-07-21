package com.greatlearning.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> findAll() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	@Override
	@Transactional
	public Employee findById(int Id) {
		Optional<Employee> employee = employeeRepository.findById(Id);
		return employee.get();
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {

		return employeeRepository.save(theEmployee);

	}

	@Override
	@Transactional
	public Employee deleteById(int theId) {

		Optional<Employee> employee = employeeRepository.findById(theId);
		employeeRepository.deleteById(theId);
		return employee.get();

	}

	@Override
	@Transactional
	public List<Employee> findByFirstName(String firstName) {
		List<Employee> employees = employeeRepository.findByFirstName(firstName);
		return employees;
	}

}
