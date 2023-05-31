package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Objects extends BaseClass
{
	public @FindBy(xpath ="//h4[starts-with(text(),'Login ')]")
	WebElement loginpanel;

	public @FindBy(xpath ="//button[text()='Reset']")
	WebElement resetbtn;

	public @FindBy(xpath ="//input[@id='username']")
	WebElement user;

	public @FindBy(xpath ="//input[@id='password']")
	WebElement pass;

	public @FindBy(xpath ="//button[@id='btnsubmit']")
	WebElement loginbtn;

	public @FindBy(xpath ="//title[contains(text(),'Dashboard « Stock Accounting')]")
	WebElement title;

	public @FindBy(xpath = "//div[text()='Incorrect user ID or password']")
	WebElement errorMsg;

	public WebDriver driver;

	public Login_Objects(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public boolean validateLoginPage()
	{
		if (loginpanel.isDisplayed()) 
		{
			return true;	
		} else 
		{
			return false;
		}
	}

	public void clickresetbtn()
	{
		resetbtn.click();
	}

	public void enterUser(String uid)
	{
		user.sendKeys(uid);
	}

	public void enterpass(String pwd)
	{
		pass.sendKeys(pwd);
	}

	public void clickLogin()
	{
		loginbtn.click();
	}

	public boolean validateDashboardPage()
	{
		String acttitle = driver.getTitle();
		String exptitle = title.getText();

		if (acttitle.equalsIgnoreCase(exptitle))
		{
			return true;
		} else
		{
			return false;
		}
	}

	public boolean validateErrorMsg()
	{
		if (errorMsg.isDisplayed()) 
		{
			return true;	
		} else 
		{
			return false;
		}
	}


}
