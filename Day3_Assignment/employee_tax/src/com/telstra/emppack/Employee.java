package com.telstra.emppack;

public class Employee {
	//  access and visibility for all the  derived classes  and also within the package 
	protected int empId;
	protected String empName;
	protected  int bSal;
	
	
	public Employee(int empId, String empName, int bSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bSal = bSal;
		
	}
	
	public String getDetails()
	{
		return (empId+"  "+empName+"  "+bSal);
	}
}

