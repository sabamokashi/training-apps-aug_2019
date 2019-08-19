package com.amdocs;

public class AlgorithmFactory {
	public static IAlgorithm getAlgorithm(int algorithmName)
	{
		IAlgorithm algorithm = null;
		
		if (algorithmName == 1)
			algorithm = new QuickSort();
		else if (algorithmName == 2)
			algorithm = new InsertionSort();
		else if (algorithmName == 3)
			algorithm = new HeapSort();
		else
			algorithm = new NullAlgorithm();
		return algorithm;
	    
		
	}

}
