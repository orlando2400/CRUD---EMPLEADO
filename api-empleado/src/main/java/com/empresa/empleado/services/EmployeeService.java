package com.empresa.empleado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empleado.models.Employee;
import com.empresa.empleado.repository.IEmployee;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	IEmployee Iemployee;

	@Override
	public Employee register(Employee employee) {
		
		Employee employeeLocal = (Employee) Iemployee.findByIdEmployee(employee.getIdEmployee());
		if(employeeLocal!=null) {
			System.out.println("Usuario registrado en el sistema");
		}
		else {
			employeeLocal = Iemployee.save(employee);
		}
		return employeeLocal;
	}

	@Override
	public void delete(Long employeeId) {
		Iemployee.deleteById(employeeId);
	}
	
}
