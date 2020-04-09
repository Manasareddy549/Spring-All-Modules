package com.cap.anurag.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cap.anurag.dao.EmployeeDaoImplementation;
import com.cap.anurag.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {
@Autowired
EmployeeDaoImplementation  empDao;
public Employee createEmployee(Employee emp)
{
	return empDao.createEmployee(emp);
//	empDao.save(emp);
	//return "account created successfully";
	
}
public Employee findEmployee(Integer empId)
{
	
	return empDao.findById(empId);
}
public  Employee updateEmployee(Employee emp){
	return empDao.updateEmp(emp);
	
}
public Employee deleteEmpById(Integer empId) {
	return empDao.deleteEmp(empId);
	
	}

}
