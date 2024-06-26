package com.bhushitham.assignment.employee;

public class Manager extends Employee {
	private String managerid;
	public Manager(String name, String empid, int salary, String managerid) {
		super(name, empid, salary);
		this.managerid=managerid;	
	}
	// getter and setter
	public String getManagerid() {
		return managerid;
	}
	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

}
