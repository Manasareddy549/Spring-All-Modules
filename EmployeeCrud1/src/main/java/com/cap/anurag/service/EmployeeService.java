package com.cap.anurag.service;

import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee emp) ;
    Employee findEmployee(Integer empId);
    Employee updateEmployee(Employee emp);
	Employee deleteEmpById(Integer empId);
}
