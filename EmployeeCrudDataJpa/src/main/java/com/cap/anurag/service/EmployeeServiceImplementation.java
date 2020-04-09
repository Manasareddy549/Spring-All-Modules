package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cap.anurag.dao.EmployeeDao;
import com.cap.anurag.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {
@Autowired
EmployeeDao  empDao;
public String createEmployee(Employee emp)
{
	
empDao.save(emp);
return "account created successfully";
	
}
public List<Employee> findAllEmployees()
{
	return empDao.findAll();
	
}
public Optional<Employee> findEmployee(Integer empId)
{
	
	return empDao.findById(empId);
}

public  Employee updateEmployee(Employee emp){
	return empDao.save(emp);
	
}
public void deleteEmpById(Employee empId) {
	 empDao.delete(empId);
	
	}
public void deleteAllEmployees()
{
	empDao.deleteAll();
}
@Override
public void deleteEmpById(Integer empId) {
	// TODO Auto-generated method stub
	empDao.deleteById(empId);
}

}
