package com.sg.employeeManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.stereotype.Repository;

import com.sg.employeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	List<Employee> findAllByOrderByFirstnameAsc();
}
