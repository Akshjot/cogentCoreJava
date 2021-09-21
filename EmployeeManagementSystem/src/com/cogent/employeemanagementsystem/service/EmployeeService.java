package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {
	
	EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
	
	private static EmployeeService employeeService;
	
	private EmployeeService(){
		
	}
	
	public static EmployeeService getInstance() {
		if(employeeService==null)
		{
			employeeService = new EmployeeService();
			return employeeService;
		}
		return employeeService;
	}
	
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
}
