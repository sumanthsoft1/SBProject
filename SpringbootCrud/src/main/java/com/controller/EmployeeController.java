package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/findAll")
	EmployeeService findAll() {
		return employeeService ;
	}
		
	}


