package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Employee;
@Service
public interface EmployeeService {
	
	List<Employee> save();

}
