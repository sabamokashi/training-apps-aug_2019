package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double actualResult, expectedResult;
	
	@Before
	public void init() {
		rpnCalculator = new RPNCalculator();
		actualResult = expectedResult =0;
	}
	
	@After
	public void cleanUp() {
		rpnCalculator = null;
	}
	
	@Test
	public void testSimpleAddition() {
		
		actualResult = rpnCalculator.evaluate("10 15 +");
		expectedResult = 25.0;
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate("10 115 +");
		expectedResult = 125.0;
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Category(SmokeTest.class)
	@Test
	public void testSimpleSubstraction() {
		
		actualResult = rpnCalculator.evaluate("15 10 -");
		expectedResult = 5.0;
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate("115 110 -");
		expectedResult = 5.0;
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
	public void testSimpleMultiplication() {
		
		actualResult = rpnCalculator.evaluate("5 6 *");
		expectedResult = 30.0;
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate("7 -3 *");
		expectedResult = -21.0;
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
	public void testSimpleDivision() {
		
		actualResult = rpnCalculator.evaluate("15 10 /");
		expectedResult = 1.5;
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate("20 5 /");
		expectedResult = 4.0;
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
	public void testComplexExpression() {
		
		actualResult = rpnCalculator.evaluate("15 10 / 2 *");
		expectedResult = 3.0;
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate("20 5 / 2 10 + -");
		expectedResult = -8.0;
		assertEquals(expectedResult, actualResult, 0.0001);
	}
}
