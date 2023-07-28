#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Amazon Search 
#this is the feature for which we want to write code and requirements
#one feature file can have multiple scenarios

@Smoke
Scenario: Search for a product apple macbook air
#here we give the scenario name
#below scenario (given, when, then, and) etc are known as steps
Given I have a search field on Amazon page 
#given can be considered as pre-condition
When I search for product with name "apple" and price is 1000 
#string is in double quotes
Then Product with name "apple" should be displayed
Then order id is 12345 and username is "naveen"

@Regression
Scenario: Search for a product iphone
Given I have a search field on Amazon page 
When I search for product with name "iphone" and price is 2000 
Then Product with name "iphone" should be displayed
Then order id is 5677 and username is "naveen automation"
