package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService service = EmployeeService.getInstance();
		
		Employee employee = new Employee("a001", "Alex", "Hales", 10000.0f, "NY");
		
		String result = service.addEmployee(employee);
		
		System.out.println(result);
	}

}
