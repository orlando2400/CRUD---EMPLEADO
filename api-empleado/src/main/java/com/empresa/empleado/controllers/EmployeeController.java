package com.empresa.empleado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.empleado.models.Employee;
import com.empresa.empleado.services.EmployeeService;

@RestController("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/register")
	public Employee registerEmployee(@RequestBody Employee employee) throws Exception {
		
		return employeeService.register(employee);
		
	}
	@DeleteMapping("/{employeId}")
	public void deleteEmployee(@PathVariable("employeId") Long employeeId ) {
		employeeService.delete(employeeId);
	}
}
