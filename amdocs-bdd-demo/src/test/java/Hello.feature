Feature: Develop a Hello World Java Application

	Scenario: should be able to invoke sayHello greeting method
		Given I have created a hello object
		When I invoke the sayHello method on the hello object
		Then I expect the response as "Hello BDD!"