package CucumberFramework.stepFiles;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Homepage{
	
	@Given("^User navigates to openweathermap website$")
	public void user_navigates_to_openweathermap_website() throws Throwable {
		BasePage.driver.get("https://openweathermap.org/");
	}

	@When("^user navigates to openweathermap website$")
	public void homepage_is_displayed() throws Throwable {
		BasePage.driver.get("https://openweathermap.org/");
		BasePage.driver.findElement(By.xpath("//*[@id='searchform']/span/button")).isDisplayed();
	}

	@Then("^user should be able to see the homepage title, searchbox and searchbutton$")
	public void user_should_be_able_to_see_the_homepage_title_searchbox_and_searchbutton() throws Throwable {
		Assert.assertTrue(BasePage.driver.findElement(By.cssSelector("input#q")).isEnabled());
        Assert.assertTrue(BasePage.driver.findElement(By.cssSelector("button.btn.btn-orange")).isDisplayed());
        Assert.assertTrue(BasePage.driver.findElement(By.cssSelector("button.btn.search-cities__lnk")).isDisplayed());
        Assert.assertTrue(BasePage.driver.findElement(By.cssSelector("h2.weather-widget__city-name")).isDisplayed());
		Assert.assertEquals(true, BasePage.driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div[1]/a/img")).isDisplayed());
	}

}
