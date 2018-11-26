Feature: Performing a valid City search
	User should be able to see the weather details for the entered valid city

Scenario: Performing a search operation
    Given User navigates to openweathermap website
    When Homepage is displayed
    Then User should be able to see the homepage title, searchbox and searchbutton 
