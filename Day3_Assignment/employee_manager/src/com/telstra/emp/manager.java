package com.telstra.emp;

public class manager extends employee{
	private String deptname;
	private int empcount;
	public manager(int empid, String empname, int empsalary, String deptname, int empcount) {
		super(empid, empname, empsalary);
		this.deptname = deptname;
		this.empcount = empcount;
	}
	@Override
	public String getdetails() {
		return "manager [deptname=" + deptname + ", empcount=" + empcount + ", empid=" + empid + ", empname=" + empname
				+ ", empsalary=" + empsalary + "]";
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getEmpcount() {
		return empcount;
	}

	
}
