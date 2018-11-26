Feature: Verifying important information to get city's weather on home page
	User should be able to see the homepage with option to enter the city to check its weather

Scenario: Verfying the important information such as labels, buttons and header displayed on home page
    Given User navigates to openweathermap website
    When Homepage is displayed
    Then User should be able to see the homepage title, searchbox and searchbutton 
