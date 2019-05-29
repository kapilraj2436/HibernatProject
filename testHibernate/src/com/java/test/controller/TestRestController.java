package com.java.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.test.entity.Department;
import com.java.test.entity.Employee;
import com.java.test.service.DepartmentService;
import com.java.test.service.EmployeeService;

@RestController
public class TestRestController {

	static{
		System.out.println("TestController Initialized");
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/rest/showAllEmployee")
	public ResponseEntity<List<Employee>> showAllEmployee()
	{
		System.out.println("showAllEmployee method called.");
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(employeeService.showAllEmployees());
	}
	
	@PostMapping("/rest/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
	{
		System.out.println("addEmployee method called. with - "+employee);
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(employeeService.addEmployee(employee));
	}
	
	@PostMapping("/rest/addDepartment")
	public ResponseEntity<String> addDepartment(@RequestBody Department dept)
	{
		System.out.println("addDepartment method called.");
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(departmentService.addDepartment(dept));
	}
	
	@GetMapping("/rest/showDepartment")
	public ResponseEntity<List<Department>> showDepartment()
	{
		System.out.println("showDepartment method called.");
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(departmentService.showAllDepartments());
	}
	
}
