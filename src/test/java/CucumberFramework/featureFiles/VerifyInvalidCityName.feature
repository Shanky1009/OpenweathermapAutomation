Feature: Performing an invalid City search
	User should be able to see "Not found" result when enter the invalid city name to check its weather

Scenario: Performing a search operation
    Given User is on home page of openweathermap website
    When searched weather for invalid city name
    Then application shall display an error