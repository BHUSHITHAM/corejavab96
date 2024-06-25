package com.tnsif.encapsulation;

public class Encapsulation {
	int serial_num=11;
	String name;
	int age;
	private String clg;
	private int batchid;
	
	void show()
	{
		System.out.println("Serial num "+serial_num+" Name: "+name+" Age:"+age);
	}
    
	//getter and setter
	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
// tostring

	@Override
	public String toString() {
		return "Encapsulation [serial_num=" + serial_num + ", name=" + name + ", age=" + age + ", clg=" + clg
				+ ", batchid=" + batchid + "]";
	}
	
	
}
