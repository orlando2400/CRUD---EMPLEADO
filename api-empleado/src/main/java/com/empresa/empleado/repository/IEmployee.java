package com.empresa.empleado.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleado.models.Employee;

public interface IEmployee extends JpaRepository<Employee, Long>{
	
	public List<Employee> findByIdEmployee(Long idEmployee);
}
