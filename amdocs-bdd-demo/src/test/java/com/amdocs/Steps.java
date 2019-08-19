package com.amdocs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private Hello hello;
	private String actualResponse;
	
	

	@Given("I have created a hello object")
	public void i_have_created_a_hello_object() {
    // Write code here that turns the phrase above into concrete actions
		hello= new Hello();
	}

	@When("I invoke the sayHello method on the hello object")
	public void invokeSayHello() {
	   actualResponse = hello.sayHello();
	}

	@Then("I expect the response as {string}")
	public void verifyResponse(String expectedResponse) {
	    assertEquals(expectedResponse, actualResponse);
	}

}
