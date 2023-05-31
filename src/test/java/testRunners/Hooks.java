package testRunners;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.BaseClass;
import pageObjects.Login_Objects;

public class Hooks extends BaseClass
{
	
	
	@Before()
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://webapp.qedgetech.com/login.php");
		lo = new Login_Objects(driver);
	}
	
	@After()
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
}
