package com.sg.employeeManagement.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.employeeManagement.model.Employee;
import com.sg.employeeManagement.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List> getAllEmployee(){
		List<Employee> employeeList=employeeService.getAllEmployee(); 
		return new ResponseEntity(employeeList,HttpStatus.OK);
	}
}
