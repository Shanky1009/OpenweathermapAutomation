
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsDemo
{

	@Test
	public void testcityweather(){

		WebDriver driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");  
		String Expectedtitle = "Current weather and forecast - OpenWeatherMap";
		//it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
}