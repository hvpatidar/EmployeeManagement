package com.sg.employeeManagement.service;
import com.sg.employeeManagement.model.Employee;
import com.sg.employeeManagement.repository.EmployeeRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}
	

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAllByOrderByFirstnameAsc();
	}


	
	
	
	

}
