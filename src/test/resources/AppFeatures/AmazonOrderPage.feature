Feature: amazon order page
	in order to check my order details
	as a registered user
	i want to specify the features of order details page
	
Background:
	Given a registered user exists
	Given user is on amazon login page
	When user enters username
	And user enters password
	And user clicks on login button
	Then user navigates to order page
	
Scenario: check previous order details
	When user clicks on orders link
	Then user checks the previous order details
	
Scenario: check open order details
	When user clicks on open orders link
	Then user checks the open order details
	
Scenario: check cancelled order details
	When user clicks on cancelled orders link
	Then user checks the cancelled order details