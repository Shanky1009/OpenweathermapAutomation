package CucumberFramework.stepFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidCityPage {

	@When("^searched weather for a valid city name$")
	public void homepage_is_displayed() throws Throwable {
		WebElement searchField = BasePage.driver.findElement(By.xpath("//*[@placeholder='Your city name']"));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) BasePage.driver;
		javascriptExecutor.executeScript("arguments[0].click();", searchField);
		searchField.clear();
		searchField.sendKeys("Nagpur");
        BasePage.driver.findElement(By.cssSelector("button.btn.btn-orange")).click();
	}

	@Then("^application shall display weather details for the city name$")
	public void user_should_be_able_to_see_the_homepage_title_searchbox_and_searchbutton() throws Throwable {
		Assert.assertTrue(BasePage.driver.findElement(By.xpath("//a[contains(text(), ' Nagpur, IN')]")).isDisplayed());
		Assert.assertTrue(BasePage.driver.findElement(By.xpath("//p/span[@class='badge badge-info']")).isDisplayed());
		Assert.assertTrue(BasePage.driver.findElement(By.xpath("//p[contains(text(),'Geo coords ')]")).isDisplayed());
	}
}
