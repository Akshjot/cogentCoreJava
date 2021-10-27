package com.cogent.emsjdbc.service;

import java.io.IOException; 
import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.dto.Employee;


public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) ;
	public void deleteAllEmployees();
	public Optional<Employee> getEmployeeById(String id);
	public Optional<List<Employee>> getEmployees();
	public Employee[] getEmployeesByName(String name);
	public String updateEmployee(String id, Employee employee) ;
}