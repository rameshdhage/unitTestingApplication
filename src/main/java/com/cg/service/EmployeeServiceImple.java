package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.reposotory.EmployeeRepository;
@Service
public class EmployeeServiceImple  implements EmployeeService{
	
	
	@Autowired
     private EmployeeRepository repo;

	@Override
	public Employee createEmp(Employee employee) {
		Employee newEmp=repo.save(employee);
		return  newEmp;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> listEmp=repo.findAll();
		return listEmp;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Employee emp=repo.findById(id).orElse(null);
		return emp;
	}

	@Override
	public List<Employee> getByNameEmp(String name) {
		// TODO Auto-generated method stub
		List<Employee> list=repo.getByName(name);
		
		return list;
	}

	@Override
	public List<Employee> getByCityEmp(String city) {
		// TODO Auto-generated method stub
		List<Employee> list=repo.getByCity(city);
		return list;
	}

	@Override
	public Employee updateEmp(Employee emp, int id) {
		// TODO Auto-generated method stub
		Employee oldEmp=repo.findById(id).orElse(null);
		oldEmp.setId(emp.getId());
		oldEmp.setCity(emp.getCity());
		oldEmp.setEmail(emp.getEmail());
		oldEmp.setName(emp.getName());
		oldEmp.setSalary(emp.getSalary());
		
		repo.save(oldEmp);
		
		return oldEmp;
	}

	

	
		

}
