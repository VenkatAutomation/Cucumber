package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Add_Stock_Objects;
import pageObjects.BaseClass;

public class AddStock_Steps extends BaseClass
{
	Add_Stock_Objects as = new Add_Stock_Objects(driver);
	
	@Given("login to app")
	public void login_to_app() 
	{
	 as.clickLoginBtn();  
	}
	
	@Then("click on stock items")
	public void click_on_stock_items() 
	{
	    as.clickStockItems();
	}

	@Then("click on stock categories")
	public void click_on_stock_categories() 
	{
	    as.clickStockcategories();
	}

	@When("click on add button")
	public void click_on_add_button() 
	{
	    as.clickAddBtn();
	}

	@Then("enter category name {string}")
	public void enter_category_name(String stock) 
	{
	   as.enterCategoryName(stock);
	}

	@Then("click on add btn")
	public void click_on_add_btn() 
	{
	    as.clickCatAddBtn();
	}

	@Then("accept confirm msg")
	public void accept_confirm_msg() 
	{
	    as.confirmMsg();
	}

	@Then("validate success msg")
	public void validate_success_msg() 
	{
	    as.validateSuccessMsg();
	}

	@Then("user should check whether added or not with name {string}")
	public void user_should_check_whether_added_or_not_with_name(String stock) 
	{
	   as.validateAddedStockCategory(stock);
	}

	@Then("user logout app")
	public void user_logout_app() 
	{
	   as.clickLogout();
	}






}
