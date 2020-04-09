package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	String createEmployee(Employee emp) ;
    Optional<Employee> findEmployee(Integer empId);
    Employee updateEmployee(Employee emp);
	void deleteEmpById(Integer empId);
	public List<Employee> findAllEmployees();
	public void deleteAllEmployees();
}
