package com.java.test.dao;

import java.util.List;

import com.java.test.entity.Department;

public interface DepartmentDao {
	
	public List<Department> showAllDepartments();
	public List<Department> showDepartmentByEmployeeId(String employee);
	public Department getDepartment(String deptId);
	public String addDepartment(Department employee);
	public String deleteDepartment(String deptId);
	public Department updateDepartment(Department dept);
	
}
