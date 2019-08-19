package com.amdocs.smm;

public class Address {
	public String doorNo;
	public String street1,street2;
	public String city;
	public String pincode;
	
	public Address(String doorNo, String street1,String street2, String city, String pincode) {
		this.doorNo = doorNo;
		this.street1 = street1;
		this.street2= street2;
		this.city = city;
		this.pincode = pincode;
	}

	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street1 + street2 +", city=" + city + ", pincode=" + pincode + "]";
	}
	
}