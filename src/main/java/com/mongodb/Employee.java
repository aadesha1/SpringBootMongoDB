package com.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="employees")
public class Employee {

	@Field(name = "first_name")
	private String firstName;
	
	@Field(name = "last_name")
	private String lastName;
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName,String lastName) {
		if(firstName != null)
			this.firstName = firstName;
		
		if(lastName != null)
			this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
}
