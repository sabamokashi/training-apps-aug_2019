package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I have deployment the RPNCalculator SOAP api at URL {string}")
	public void getSOAPWSDLURL(String wsdlURL) {
		
		soapWSDLURL = wsdlURL;
	   
	}

	@Given("the input is {string}")
	public void setInput(String rpnMathExpression) {
		this.rpnMathExpression = rpnMathExpression;
		
	    
	}

	@When("I invoke the SOAP API")
	public void i_invoke_the_SOAP_API() {
		
		RPNCalculatorService rpnWebService = new RPNCalculatorService();
		RPNCalculator rpncalculator = rpnWebService.getRPNCalculator();
		
		actualResult = rpncalculator.evaluate(rpnMathExpression);
		
		
	   
	}

	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String expectedResult) {
		Double expectedResult1 =Double.parseDouble(expectedResult);
	   assertEquals(expectedResult1, actualResult,0.001);
	  
	}

}
