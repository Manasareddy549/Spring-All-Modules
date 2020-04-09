package com.cap.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.Employee;
import com.cap.anurag.service.EmployeeService;

@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4200")
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;
	@PostMapping("/CreateAccount")
	public String createAccount(@RequestBody Employee emp)
	{
		Employee e=empService.createEmployee(emp);
		if(e==null)
		{
			return "Unable to insert";
		}
		else
		{
			return "Employee was inserted successfully";
		}
		
	}
	@GetMapping("/fingById/{empId}")
	public Employee findEmployee(@PathVariable("empId") Integer empId)
	{
		return empService.findEmployee(empId);
		
	}
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp)
	{
		Employee e1= empService.updateEmployee(emp);
		if(e1!=null)
		{
			return "updated successfully!"+emp.getEid()+emp.getEname()+emp.getEsal();
		}
		else
		{
			return "employee details not updated";
		}
		
	}
@DeleteMapping("/deleteEmp/{empId}")
public String deleteEmp(@PathVariable ("empId") Integer empId)
{
	Employee e3=empService.deleteEmpById(empId);
	if(e3==null)
	{
		return "not deleted";
	}
	else
	{
		return "deleted successfully";
	}
	
}
}



