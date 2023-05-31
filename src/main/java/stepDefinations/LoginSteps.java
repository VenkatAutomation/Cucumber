package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.Login_Objects;
import testRunners.Hooks;

public class LoginSteps extends BaseClass
{
	
	Login_Objects lo = new Login_Objects(driver);
	
	@Given("user should see loginpage")
	public void user_should_see_loginpage() 
	{
		lo.validateLoginPage();
	}

	@When("user click on reset button")
	public void user_click_on_reset_button() 
	{
		lo.clickresetbtn();
	}

	@When("user enter username {string}")
	public void user_enter_username(String uid) 
	{
		lo.enterUser(uid);
	}

	@When("user enter password {string}")
	public void user_enter_password(String pwd) 
	{
		lo.enterpass(pwd);
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		lo.clickLogin();
	}

	@Then("user should validate dashboard page")
	public void user_should_validate_dashboard_page() 
	{

	}

	@Then("user should see error message")
	public void user_should_see_error_message() 
	{
		lo.validateErrorMsg();
	}
	
	
}
