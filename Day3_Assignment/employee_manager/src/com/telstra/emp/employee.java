package com.telstra.emp;

public abstract class employee {
	protected int empid;
	protected String empname;
	protected int empsalary;
	public employee(int empid, String empname, int empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public String getdetails()
	{
		return (empid + " " + empname + " ");
	}
	protected abstract double calcnetsal(); 
		
	
}

