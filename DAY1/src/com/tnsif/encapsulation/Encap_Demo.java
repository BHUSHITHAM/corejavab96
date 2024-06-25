package com.tnsif.encapsulation;

public class Encap_Demo {

	public static void main(String[] args) {
		// normal excecution
		Encapsulation ob=new Encapsulation();
		ob.show();
		//getter and setter
		ob.setBatchid(96);
		ob.setClg("DBIT");
		
		// System.out.println(ob); provides address
		System.out.println(ob);
	}

}
