package com.amdocs.smm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("room no.5","CST Road","Road No.6","mumbai","400079");
		Employee saba =new Employee("saba", "software engineer","AD TECH",address);
		System.out.println(saba.getDetails());
		
	}

}
