package com.java.test.service;

import java.util.List;

import com.java.test.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> showAllEmployees();
	public List<Employee> showEmployeesByDepartment(String dept);
	public Employee getEmployee();
	public String addEmployee(Employee employee);
	public String deleteEmployee();
	public Employee updateEmployee();
	
	
}
