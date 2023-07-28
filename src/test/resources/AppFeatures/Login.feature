Feature: login feature

Scenario Outline: failed login - different combinations
	Given user is on application landing page
	When user clicks on signin button
	Then user is displayed login page
	When user enters "<userName>" in username field
	When user enters "<password>" in password field
	And user clicks on signin button
	Then error displayed for wrong credentials
	
		Examples:
			| userName | password |
			| incorrectusername | 234324 |
			| naveen auto | incorrectpassword |
			| incorrectusername | incorrectpassword |