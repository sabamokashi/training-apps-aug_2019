package com.amdocs;

public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("balance retrieved");
		return 7000.00;
	}
	
	
	public double withdraw (double amountToBerWithdrawn) throws InsufficientBalanceException{
		System.out.println("Inside withdraw method");
		
		double currentBalance = getBalance();
		if(amountToBerWithdrawn < currentBalance)
			currentBalance = currentBalance -  amountToBerWithdrawn;
		else
			throw new InsufficientBalanceException();
			
		updateBalanceIntoDB(currentBalance);
		return currentBalance;
		
	}
	
	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Assume here balance is updated into DB");
		
	}

}
