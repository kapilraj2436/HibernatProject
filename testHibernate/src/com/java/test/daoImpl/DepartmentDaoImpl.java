package com.java.test.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.test.dao.DepartmentDao;
import com.java.test.entity.Department;
import com.java.test.entity.Employee;


@Repository
public class DepartmentDaoImpl implements  DepartmentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Department> showAllDepartments() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Department.class);
		return (List<Department>) criteria.list();
	}

	@Override
	public List<Department> showDepartmentByEmployeeId(String dept) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Department.class);
		criteria.add(Restrictions.eq("department", dept));
		return (List<Department>) criteria.list();
	}

	@Override
	public String addDepartment(Department dept) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(dept);
		return "Department- "+dept.getDepartmentName()+", added successfully.";
	}

	@Override
	public Department getDepartment(String deptId) {
		return null;
	}

	@Override
	public String deleteDepartment(String deptId) {
		return null;
	}

	@Override
	public Department updateDepartment(Department dept) {
		return null;
	}

	
}
