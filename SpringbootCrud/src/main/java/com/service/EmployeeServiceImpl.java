package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeDao employeeDao;
	@Override
	public List<Employee> save() {
		
		return employeeDao.save();
	}

}
