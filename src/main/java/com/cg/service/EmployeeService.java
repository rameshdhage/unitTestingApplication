package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Employee;

 
public interface EmployeeService  {
	
	public Employee createEmp(Employee employee);
	
    public List<Employee>getAll();
    
    public Employee getById(int id);
    
    public List<Employee> getByNameEmp(String name);
	
	public List<Employee> getByCityEmp(String city);
	
	public Employee updateEmp(Employee emp ,int id);
	
	
}
