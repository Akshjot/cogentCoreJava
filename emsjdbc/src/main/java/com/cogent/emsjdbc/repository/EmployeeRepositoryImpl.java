package com.cogent.emsjdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.utils.DBUtils;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	
	
	@Autowired
	DBUtils db;

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		String insertStatement = "INSERT INTO productcrud.employees(empId, empFirstName, empLastName, doj, dob, empSalary) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = con.prepareStatement(insertStatement);
			
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setDate(4, new Date(employee.getDoj().getTime()));
			preparedStatement.setDate(5, new Date(employee.getDob().getTime()));
			preparedStatement.setFloat(6, employee.getEmpSalary());
			
			int count = preparedStatement.executeUpdate();		
			
			if(count>0)
				System.out.println("added");
			else
				System.out.println("failed to add");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		String query = "Delete From productcrud.employees WHERE empId = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1,id);
			
			int count = ps.executeUpdate();
			
			if(count==1)
				System.out.println("deleted");
			else
				System.out.println("Failed delete");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		String query = "Delete From productcrud.employees";
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			
			int count = ps.executeUpdate();
			
			if(count>=1)
				System.out.println("deleted");
			else
				System.out.println("Failed delete");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		String query = "SELECT * FROM productcrud.employees WHERE empId = ?";
		
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
				Employee employee = new Employee();
				employee.setEmpId(rs.getString("empId"));
				employee.setEmpFirstName(rs.getString("empFirstName"));
				employee.setEmpLastName(rs.getString("empLastName"));
				employee.setEmpSalary(rs.getFloat("empSalary"));
				employee.setDob(rs.getDate("dob"));
				employee.setDoj(rs.getDate("doj"));
				return Optional.ofNullable(employee);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Optional.empty();
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		
		String query = "Select * from productcrud.employees";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Employee> arrayList = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Employee employee = new Employee();
				
				employee.setEmpId(rs.getString("empId"));
				employee.setEmpFirstName(rs.getString("empFirstName"));
				employee.setEmpLastName(rs.getString("empLastName"));
				employee.setEmpSalary(rs.getFloat("empSalary"));
				employee.setDob(rs.getDate("dob"));
				employee.setDoj(rs.getDate("doj"));
				
				
				arrayList.add(employee);
			}
			
			return Optional.ofNullable(arrayList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection(con);
		}
		
		return Optional.empty();
	}

	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		String query = "UPDATE productcrud.employees SET empId = ?, empFirstName = ?, empLastName = ?, doj = ?, dob = ?, empSalary = ? WHERE empId = ?";
		
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, employee.getEmpId());
			ps.setString(2, employee.getEmpFirstName());
			ps.setString(3, employee.getEmpLastName());
			ps.setDate(4, new Date(employee.getDoj().getTime()));
			ps.setDate(5, new Date(employee.getDob().getTime()));
			ps.setFloat(6, employee.getEmpSalary());
			ps.setString(7, id);
			
			int count = ps.executeUpdate();		
			
			if(count>0)
				System.out.println("updated");
			else
				System.out.println("failed to add");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
