package com.amdocs.smm;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(10);
		numbers.add(150);
		numbers.add(50);
		numbers.add(200);
		System.out.println("Size of the array is : " + numbers.size());
		System.out.println("list of elements are : ");
		
		for (int element : numbers)
		{
			System.out.println(element);
		}

		numbers.sort(null);
		
		System.out.println("sorted list of elements are : ");
		for (int element : numbers)
		{
			System.out.println(element);
		}
	}

}
