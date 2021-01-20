package com.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	public Employee findByFirstName(String first_name);
	public Employee findByLastName(String last_name);
	
}
