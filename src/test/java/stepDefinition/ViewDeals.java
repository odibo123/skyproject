package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ViewDealsPage;

public class ViewDeals extends TestBase{
private ViewDealsPage viewDealsPage;

public ViewDeals(){
	viewDealsPage= PageFactory.initElements(driver, ViewDealsPage .class);
	
}



/*@When("^user chooses a monthly deals from View deals page$")
public void user_chooses_a_monthly_deals_from_View_deals_page() throws Throwable {
   
}
*/
@When("^user log into view deal page$")
public void user_log_into_view_deal_page() throws Throwable {
	viewDealsPage.click_ViewDealLink();
}
@When("^user chooses a product$")
public void user_chooses_a_product() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,250)", "");
	viewDealsPage.I_shouldclickBuyIphone11Tab();
}

@When("^user chooses a \"([^\"]*)\" from View deals page$")
public void user_chooses_a_from_View_deals_page(String monthlyDeals) throws Throwable {
	//JavascriptExecutor jse = (JavascriptExecutor) driver;
	// jse.executeScript("window.scrollBy(0,250)", "");
	// viewDealsPage.click_BuyIphone11Tab();
		//viewDealsPage.click_BuyIphone11ProTab();
		//viewDealsPage.click_BuyIphone11ProProMaxTab();
    
	
}
@When("^user logs into choose your plan page by entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_logs_into_choose_your_plan_page_by_entering_and_and(String arg1, String arg2, String arg3) throws Throwable {
    
}

@When("^user continue to your basket page$")
public void user_continue_to_your_basket_page() throws Throwable {
    
}

@Then("^user validate the price$")
public void user_validate_the_price() throws Throwable {
    
}

@Then("^user checks out into sign in page$")
public void user_checks_out_into_sign_in_page() throws Throwable {
  
}

@When("^user validates no transaction was made$")
public void user_validates_no_transaction_was_made() throws Throwable {
   
}
}
