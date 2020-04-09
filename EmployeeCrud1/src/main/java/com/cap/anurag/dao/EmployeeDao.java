package com.cap.anurag.dao;

import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeDao {
	public void save(Employee emp) ;
	public Employee findById(Integer empId);
	public Employee updateEmp(Employee emp);
	public Employee deleteEmp(Integer empId);
}
