package com.cg.reposotory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	 public List<Employee>getByName(String name);
	 
	 public List<Employee> getByCity(String city);
	

}
