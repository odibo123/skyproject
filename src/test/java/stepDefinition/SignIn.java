package stepDefinition;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.MyAccountPage;
//import page.HomePage;
import page.SigninPage;

public class SignIn extends TestBase{
	
	
private	SigninPage signinPage;
private HomePage homePage;
private MyAccountPage  myAccountPage ;
	public SignIn (){
		signinPage=PageFactory.initElements(driver, SigninPage.class);
		homePage= PageFactory.initElements(driver, HomePage.class);
		myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
	}
	
	@When("^user log into signin page$")
	public void user_log_into_signin_page() throws Throwable {
		//Thread.sleep(3000);
		homePage.click_signInlink();	
	}
	@When("^user log in by entering correct \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void user_log_in_by_entering_correct_and(String emailId, String password) throws Throwable {
		signinPage.type_EmailField(emailId);
		signinPage.type_passwordField(password);
		signinPage.click_login_button();	
	}
	@Then("^the dashboard should display that \"([^\"]*)\" is logged in successfullly$")
	public void the_dashboard_should_display_that_is_logged_in_successfullly(String  user) throws Throwable {
	String text=	myAccountPage.validate_LoggedInUsername();
	System.out.println(text);
	}
	@Then("^user signs out$")
	public void user_signs_out() throws Throwable {
		myAccountPage.click_UserSignOut();
		myAccountPage.click_SignOutButton();
		
	}
}
