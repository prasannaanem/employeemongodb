package com.employeemongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemongodb.entity.Employee;
import com.employeemongodb.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public String createEmployee(@RequestBody Employee employee) {
		
		employeeService.createEmployee(employee);
		return "Success Fully savad Your EmPloyee data";
	}
	@GetMapping("/get")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
}
