package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Employee;
@Repository
public interface EmployeeDao {
	
	List<Employee> save();

}
