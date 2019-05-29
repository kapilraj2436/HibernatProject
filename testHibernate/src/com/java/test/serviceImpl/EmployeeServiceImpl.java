package com.java.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.test.dao.EmployeeDao;
import com.java.test.entity.Employee;
import com.java.test.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> showAllEmployees() {
		return employeeDao.showAllEmployees();
	}

	@Override
	public List<Employee> showEmployeesByDepartment(String dept) {
		return employeeDao.showEmployeesByDepartment(dept);
	}

	@Override
	public Employee getEmployee() {
		return employeeDao.getEmployee();
	}

	@Override
	public String addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public String deleteEmployee() {
		return employeeDao.deleteEmployee();
	}

	@Override
	public Employee updateEmployee() {
		return employeeDao.updateEmployee();
	}

}
