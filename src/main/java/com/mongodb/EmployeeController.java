package com.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(path="/employees")
	public List<Employee> getEmployee()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping(path="/employeefname/{name}")
	public Employee getEmployeeByFirstName(@PathVariable String name)
	{
		return employeeRepository.findByFirstName(name);
	}
	
	@GetMapping(path="/employeelname/{name}")
	public Employee getEmployeeByLastName(@PathVariable String name)
	{
		return employeeRepository.findByLastName(name);
	}
	
	
	
	@GetMapping(path="/save")
	public void saveEmployees()
	{
		employeeRepository.save(new Employee("Chagan","Verma"));
		
	}

}
