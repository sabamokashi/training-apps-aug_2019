package com.amdocs;

public class Main {

	public static void main(String[] args) {
	   
		PaperWala paperwala = new PaperWala("Pune Paperwala Pvt Ltd.");
		paperwala.addSubscriber(new Subscriber("Ramesh"));
		paperwala.addSubscriber(new Subscriber("Suresh"));
		paperwala.addSubscriber(new Subscriber("shree"));
		
		paperwala.notifyAllAUbscriber("Times of India");


	}

}
