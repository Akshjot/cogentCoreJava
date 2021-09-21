package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Department {
	
	private String deptID;
	private String deptName;
	private String deptAddress;
	private String phoneNo;
	
	public Department()
	{
		this.deptID = "";
	}
}
