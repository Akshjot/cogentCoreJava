package com.cogent.emsjdbc.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.dto.Employee;

public class EmployeeRepositoryImpl2 implements EmployeeRepository {
	private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null)
		{
			employeeRepository = new EmployeeRepositoryImpl2();
			return employeeRepository;
		}
		return employeeRepository;
	}
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
