Feature: White Background Change 

Background: 
	Given Set SkyWhite Background button exists 
	
@Execute2 
Scenario: 1 User should able to change and verify background color 
	When User click on the button; 
	Then The background color will change to white 
