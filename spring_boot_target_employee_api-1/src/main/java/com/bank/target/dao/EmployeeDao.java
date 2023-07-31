package com.bank.target.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.target.model.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
