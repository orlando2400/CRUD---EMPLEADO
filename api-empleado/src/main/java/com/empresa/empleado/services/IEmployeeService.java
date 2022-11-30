package com.empresa.empleado.services;

import com.empresa.empleado.models.Employee;

public interface IEmployeeService {
	public Employee register(Employee employee);
	public void delete(Long employeeId);
}
