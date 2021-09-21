package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {
	
	private String employeeID;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	
	public Employee() {
		this.employeeID = "";
		
	}

/*	public Employee(String employeeID, String firstName, String lastName, float empSalary) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
	} */
	
	
	
}
