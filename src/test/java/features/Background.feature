Feature: Sky Blue Background change
 
Background:
Given Set SkyBlue Background button exists
 
@Execute1 
Scenario: 1 User should able to change and verify background color
		 When I click on the button
 		 Then the background color will change to sky blue