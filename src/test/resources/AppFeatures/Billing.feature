Feature: calculate billing amount

Scenario Outline: bill amount
	Given user is on billing page
	When user enters bill amount "<billAmount>"
	When user enters tax amount "<taxAmount>"
	And user clicks calculate button
	Then final amount is given "<finalAmount>"
	
		Examples:
			| billAmount | taxAmount | finalAmount |
			| 1000	| 10 | 1010 |
			| 100 | 40 | 140 |
			| 20 | 6.7 | 26.7 |