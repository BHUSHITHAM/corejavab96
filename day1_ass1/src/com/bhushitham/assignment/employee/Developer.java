package com.bhushitham.assignment.employee;

public class Developer extends Employee {
	private String DId;

	public Developer(String name, String empid, int salary,String DId) {
		super(name, empid, salary);
		this.DId=DId;
	}
	//getter setter

	public String getDId() {
		return DId;
	}

	public void setDId(String dId) {
		DId = dId;
	}
	
	

}
