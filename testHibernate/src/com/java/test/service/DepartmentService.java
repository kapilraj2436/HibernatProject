package com.java.test.service;

import java.util.List;

import com.java.test.entity.Department;
import com.java.test.entity.Employee;

public interface DepartmentService {

	
	public List<Department> showAllDepartments();
	public List<Department> showDepartmentByEmployeeId(String employee);
	public Department getDepartment(String deptId);
	public String addDepartment(Department employee);
	public String deleteDepartment(String deptId);
	public Department updateDepartment(Department dept);
	
	
}
