package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employeeApp")
public class TestController {

	@Autowired
	EmployeeService employeeservice;

	// http://localhost:8080/employeeApp/getAllEmployees
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeservice.getAllEmployees();

	}

	
}
