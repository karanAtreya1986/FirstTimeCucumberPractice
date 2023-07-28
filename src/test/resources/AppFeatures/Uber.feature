
@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User selects car type "Sedan" from app
When user selects car as "Sedan" and pick up as "bangalore" and drop as "pine"
Then driver starts the journey
And driver ends the journey
Then user pays 100 us dollars
Then user checks the trip details

@Regression @Smoke
Scenario: Booking Cab SUV
Given User selects car type "suv" from app
When user selects car as "suv" and pick up as "bangalore" and drop as "hyderabad"
Then driver starts the journey
And driver ends the journey
Then user pays 100 us dollars

@Prod
Scenario: Booking Cab MINI
Given User selects car type "mini" from app
When user selects car as "mini" and pick up as "mumbai" and drop as "pine"
Then driver starts the journey
And driver ends the journey
Then user pays 100 us dollars

