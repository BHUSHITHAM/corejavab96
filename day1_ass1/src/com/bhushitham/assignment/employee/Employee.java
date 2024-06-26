package com.bhushitham.assignment.employee;

public class Employee {
	private String name;
	private String empid;
	private int salary;
	
	public Employee(String name, String empid, int salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
}
