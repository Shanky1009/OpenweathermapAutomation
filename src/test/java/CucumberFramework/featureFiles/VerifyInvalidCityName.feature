Feature: Performing an invalid City search
	User should be able to see "Not found" result when enter the invalid city name to check its weather

Scenario: Performing a search operation
    Given User navigates to openweathermap website
    When Homepage is displayed
    Then User should be able to see the homepage title, searchbox and searchbutton 
