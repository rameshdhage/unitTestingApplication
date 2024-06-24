package com.cg.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImple;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		Employee newEmp=service.createEmp(emp);
		
		return  newEmp;
	}
	
	@GetMapping("/allEmp")
		public List<Employee> allEmp(){
			List<Employee> list=service.getAll();
			return list;
		}
	
    @GetMapping("/empId/{id}")
	 public Employee getEmpById(@PathVariable int id) {
		 Employee emp=service.getById(id);
		 return emp;
	 }
    
    @GetMapping("/empName/{name}")
	public List<Employee>getEmpByName(@PathVariable String name){
		List<Employee> list=service.getByNameEmp(name);
		return list;
	}
	
    @GetMapping("/empCity/{city}")
    public List<Employee>getEmpByCity(@PathVariable String city){
    	List<Employee> list=service.getByCityEmp(city);
    	return list;
    }
    
    @PutMapping("/id")
    public Employee updateEmployee( @PathVariable int id,@RequestBody Employee emp) {
    	return service.updateEmp(emp, id);
    	
    }
	
	

}
