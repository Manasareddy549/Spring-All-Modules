package com.cap.anurag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.cap.anurag.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
//	Optional<Employee> findById(Integer empId);
	}
