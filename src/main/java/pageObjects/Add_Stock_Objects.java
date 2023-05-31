package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Stock_Objects 
{
	public String stock = "Mobiles";

	public @FindBy(xpath ="//button[@id='btnsubmit']")
	WebElement loginbtn;

	public @FindBy(xpath = "//a[text()='Stock Items ']")
	WebElement stockitemsbtn;

	public @FindBy(xpath = "(//a[text()='Stock Categories'])[2]")
	WebElement stockcategorybtn;

	public @FindBy(xpath = "(//a[@data-original-title='Add'])[1]")
	WebElement addbtn;

	public @FindBy(xpath = "//input[@id='x_Category_Name']")
	WebElement categoryName;

	public @FindBy(xpath = "(//button[text()='Add'])[1]")
	WebElement addbtn1;

	public @FindBy(xpath = "//button[text()='OK!']")
	WebElement Okbtn;

	public @FindBy(xpath = "//div[text()='Add succeeded']")
	WebElement successMsg;

	public @FindBy(xpath = "(//button[text()='OK'])[6]")
	WebElement successOk;

	public @FindBy(xpath = "//span[@data-caption='Search']")
	WebElement searchbtn;

	public @FindBy(xpath = "//input[@id='psearch']")
	WebElement searchpanel;

	public @FindBy(xpath = "(//button[text()='Search'])[1]")
	WebElement searchbtn1;

	public @FindBy(xpath = "//table[@class='table ewTable']")
	WebElement Cattable;
	
	public @FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;

	public WebDriver driver;
	
	public Add_Stock_Objects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLoginBtn()
	{
		loginbtn.click();
	}

	public void clickStockItems()
	{
		Actions act = new Actions(driver);
		act.moveToElement(stockitemsbtn).build().perform();	
	}

	public void clickStockcategories()
	{
		stockcategorybtn.click();
	}

	public void clickAddBtn()
	{
		addbtn.click();
	}

	public void enterCategoryName(String stock)
	{
		this.stock=stock;
		categoryName.sendKeys(stock);
	}

	public void clickCatAddBtn()
	{
		addbtn1.click();
	}

	public void confirmMsg()
	{
		Okbtn.click();
	}

	public void validateSuccessMsg()
	{
		String msg = successMsg.getText();
		if (successMsg.equals(msg))
		{
			//successOk.click();	
  			driver.switchTo().alert().accept();
		} 
	}

	public boolean validateAddedStockCategory(String stock)
	{
		this.stock=stock;
		searchbtn.click();
		searchpanel.click();
		searchpanel.sendKeys(stock);
		String cat = driver.findElement(By.xpath("(//td[@data-name='Category_ID'])[1]")).getText();
		List<WebElement> rows = Cattable.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++)
			{
				String catid = cols.get(2).getText();
				if(catid.contains(cat)) 
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}
