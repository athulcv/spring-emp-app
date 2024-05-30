package org.jsp.springempapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.springempapp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	private EntityManager entityManager;

	public Employee saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.persist(employee);
		entityTransaction.begin();
		entityTransaction.commit();
		return employee;
	}
}
