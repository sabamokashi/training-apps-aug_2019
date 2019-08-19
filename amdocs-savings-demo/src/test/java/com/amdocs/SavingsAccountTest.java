package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SavingsAccountTest {
	
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {
		account = new SavingsAccount();
	//partial mocking
		accountSpy  = spy(account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy =  null;
	}
	@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		SavingsAccount account = new SavingsAccount();
		// partial mocking 
		SavingsAccount accountSpy =  spy(account);
		
		// stubbing
		doReturn(5000.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//code under test
		double updatedBalance = accountSpy.withdraw(1000.00);
		double expectedBalance = 4000.00;
		assertEquals(expectedBalance, updatedBalance, 0.0001);
		
		// check if get balance method was invoked exactly 1 time within withdraw method
		verify(accountSpy, times(1)).getBalance();
		//check if updateBalanceIntoDB method was invoked exactly once within withdraw
		verify(accountSpy, times(1)).updateBalanceIntoDB(anyDouble());
		
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		
		// stubbing
		doReturn(500.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//code under test
		try {
			accountSpy.withdraw(10000.00);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		
		boolean expectedResponse = true;
		assertEquals(expectedResponse, exceptionThrown);
		
		// check if get balance method was invoked exactly 1 time within withdraw method
		verify(accountSpy, times(1)).getBalance();
		//check if updateBalanceIntoDB method was invoked exactly once within withdraw
		verify(accountSpy, times(0)).updateBalanceIntoDB(anyDouble());
		
	}

}
