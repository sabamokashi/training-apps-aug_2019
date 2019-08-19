package com.amdocs;

public class Subscriber implements IObserver {
	private String name;
	
	public Subscriber(String name)
	{
		this.name= name;
		
	}

	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("Subscriber: "+name+ " received --> "+ message);
	}

}
