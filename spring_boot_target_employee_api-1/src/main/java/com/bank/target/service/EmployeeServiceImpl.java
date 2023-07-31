package com.bank.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.target.dao.EmployeeDao;
import com.bank.target.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

}
