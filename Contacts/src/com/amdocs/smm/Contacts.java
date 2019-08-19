package com.amdocs.smm;
import java.util.HashMap;

public class Contacts {
	private HashMap<String, String> contacts;
	
	public Contacts() {
		this.contacts = new HashMap<String, String>();
	}
	
	
	public void addContact ( String name, String mobileNo)
	{
		contacts.put(mobileNo,name);
		
	}
	 public String findContactNameByMobileNo(String mobileNo)
	 {
		 String name = contacts.get(mobileNo);
		 if (name == null)
			 return mobileNo;
		 return name;
	
	 }
	 
	public static void main(String[] args) {
		Contacts contacts =new Contacts();
		contacts.addContact("sam","6874920156");
		contacts.addContact("sara","6874920170");
		
		String name = contacts.findContactNameByMobileNo("6874920158");
		System.out.println(name);
		
		name = contacts.findContactNameByMobileNo("6874920170");
		System.out.println(name);
		
	}
	
	
}
