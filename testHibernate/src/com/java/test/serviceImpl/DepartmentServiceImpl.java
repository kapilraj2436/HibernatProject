package com.java.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.test.dao.DepartmentDao;
import com.java.test.entity.Department;
import com.java.test.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao departmentDao;
	
	
	@Override
	public List<Department> showAllDepartments() {
		return departmentDao.showAllDepartments();
	}

	@Override
	public List<Department> showDepartmentByEmployeeId(String employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartment(String deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addDepartment(Department dept) {
		return departmentDao.addDepartment(dept);
	}

	@Override
	public String deleteDepartment(String deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
