package com.java.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.test.entity.Employee;
import com.java.test.service.DepartmentService;
import com.java.test.service.EmployeeService;

@Controller
public class AppController {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/home")
	public String home() {
		System.out.println("showAllEmployee method called.");
		return "home";
	}

	@GetMapping("/listEmployee")
	public String showAllEmployee() {
		System.out.println("showAllEmployee method called.");
		return "home";
		// return
		// ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(employeeService.showAllEmployees());
	}
}
