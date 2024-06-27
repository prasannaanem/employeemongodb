package com.employeemongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemongodb.entity.Employee;
import com.employeemongodb.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public Employee createEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	
	
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
}
