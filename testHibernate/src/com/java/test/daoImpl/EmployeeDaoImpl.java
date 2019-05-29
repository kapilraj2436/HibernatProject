package com.java.test.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.omg.CORBA.PERSIST_STORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.test.dao.EmployeeDao;
import com.java.test.entity.Employee;


@Repository
public class EmployeeDaoImpl implements  EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Employee> showAllEmployees() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	@Override
	public List<Employee> showEmployeesByDepartment(String dept) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("department", dept));
		return (List<Employee>) criteria.list();
	}

	@Override
	public Employee getEmployee() {
		return null;
	}

	@Override
	public String addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(employee);
		return "Employee- "+employee.getEmpName()+", added successfully.";
	}

	@Override
	public String deleteEmployee() {
		return null;
	}

	@Override
	public Employee updateEmployee() {
		return null;
	}

	
	
}
