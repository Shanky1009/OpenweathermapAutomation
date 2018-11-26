Feature: Performing a valid City search
	User should be able to see the weather details for the entered valid city

Scenario: Performing a search operation
    Given User is on home page of openweathermap website
    When searched weather for a valid city name
    Then application shall display weather details for the city name
