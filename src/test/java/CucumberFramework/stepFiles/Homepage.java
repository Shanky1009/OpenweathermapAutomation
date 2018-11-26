package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Homepage {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankiy\\Desktop\\CucumberFramework\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
//	@Before
//	public void setup_firefox() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ankiy\\Desktop\\CucumberFramework\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.setCapability("marionette", true);
//		this.driver = new FirefoxDriver(firefoxOptions);
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//	}
	
	@After
	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User navigates to openweathermap website$")
	public void user_navigates_to_openweathermap_website() throws Throwable {
		driver.get("https://openweathermap.org/");
	}

	@When("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		driver.findElement(By.xpath("//*[@id='searchform']/span/button")).isDisplayed();
	}

	@Then("^User should be able to see the homepage title, searchbox and searchbutton$")
	public void user_should_be_able_to_see_the_homepage_title_searchbox_and_searchbutton() throws Throwable {
		WebElement openWeatherMapTitle = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div[1]/a/img"));
		Assert.assertEquals(true, openWeatherMapTitle.isDisplayed());
	}

}
