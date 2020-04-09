package com.cap1.dao;

import java.util.List;

import com.cap1.bean.Employee;

public interface EmployeeDaoI {

	Employee getEmployeeDetails(int id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	List<Employee> deleteEmployee(int id);

	List<Object> fetchAllEmployees();

}

