package com.amdocs.smm;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	
	private Address address;


	public Employee(String name, String designation, String department, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.address=address;

	}

	public String getDetails() {
		return "Employee [name=" + name + ", designation=" + designation + ", department=" + department + ", address="
				+ address + "]";
	}

}
