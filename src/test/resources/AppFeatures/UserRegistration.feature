Feature: user registration

Scenario: user registration with different data
Given user is on registration page
When user enters the following details
	| naveen | automation | nav@gmail | 234324 | bangalore |
	| tom | manual | tom@yahoo | 23432 | pune |
	| robert | sdet | robert@michi | 234234 | london |
Then user registration is successful

Scenario: user registration with different data with column headers
Given user is on registration page
When user enters the following details with column headers
	|firstName | lastName | email | phone | location |
	| naveen | automation | nav@gmail | 234324 | bangalore |
	| tom | manual | tom@yahoo | 23432 | pune |
	| robert | sdet | robert@michi | 234234 | london |
Then user registration is successful