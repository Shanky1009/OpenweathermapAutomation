package CucumberFramework.stepFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCityNamePage {
	
	@Given("^User is on home page of openweathermap website$")
	public void user_on_openweathermap_website() throws Throwable {
		BasePage.driver.get("https://openweathermap.org/");
	}

	@When("^searched weather for invalid city name$")
	public void homepage_is_displayed() throws Throwable {
		WebElement searchField = BasePage.driver.findElement(By.xpath("//*[@placeholder='Your city name']"));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) BasePage.driver;
		javascriptExecutor.executeScript("arguments[0].click();", searchField);
		searchField.clear();
		searchField.sendKeys("dskfhkasfh");
        BasePage.driver.findElement(By.cssSelector("button.btn.btn-orange")).click();
	}

	@Then("^application shall display an error$")
	public void user_should_be_able_to_see_the_homepage_title_searchbox_and_searchbutton() throws Throwable {
		Assert.assertTrue(BasePage.driver.findElement(By.cssSelector("div.alert.alert-warning")).isDisplayed());
	}
}
