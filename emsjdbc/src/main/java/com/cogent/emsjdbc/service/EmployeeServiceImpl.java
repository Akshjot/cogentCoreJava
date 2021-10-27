package com.cogent.emsjdbc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.repository.EmployeeRepository;
import com.cogent.emsjdbc.repository.EmployeeRepositoryImpl;
import com.cogent.emsjdbc.repository.EmployeeRepositoryImpl2;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAllEmployees();
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}
	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployee(id, employee);
	}

}
