package com.amdocs;

import java.util.Scanner;

public class Main {
	
	
	public static void displayMenu() {
		System.out.println("Main");
		System.out.println("1.QuickSort");
		System.out.println("2.InsertionSort");
		System.out.println("3.HeapSort");	
		System.out.println("4.exit");

	}
	
	public static int getChoice()
	{
		System.out.println("Enter choice");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();	
	}
	
	public static void doWork(int choice)
	{
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);
    	algorithm.sort();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		while(choice !=4) {
			displayMenu();
			choice= getChoice();
			if (choice!=4) doWork(choice);
			
		}
		System.out.println("Thank you!");
	}

}
