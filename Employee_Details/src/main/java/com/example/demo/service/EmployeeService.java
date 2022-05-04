package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	List<Employee> employeeList = new ArrayList<>
	(Arrays.asList(new Employee(101, 2100,  "Aman"),

			new Employee(101, 2100, "Aman"), new Employee(102, 3100, "shital"),
			new Employee(103, 4100, "Pooja"), new Employee(104, 1700, "Nagma")));

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	/**/
}
