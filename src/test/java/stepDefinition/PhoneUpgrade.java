package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AccountSummaryPage;
//import junit.framework.Assert;
import page.HomePage;
import page.MobileAccountPage;
import page.MobilePage;
import page.SigninPage;
import page.UpgradePage;

public class PhoneUpgrade extends TestBase{
	private HomePage homePage;
	private MobilePage mobilePage;
	private UpgradePage upgradePage;
	private SigninPage  signinPage;
	private AccountSummaryPage  accountSummaryPage ;
	private MobileAccountPage mobileAccountPage;
	
	public PhoneUpgrade(){
		 homePage= PageFactory.initElements(driver, HomePage .class);
		 mobilePage=PageFactory.initElements(driver, MobilePage.class);
		 upgradePage= PageFactory.initElements(driver,  UpgradePage .class);
		 signinPage = PageFactory.initElements(driver,SigninPage.class);
		 accountSummaryPage= PageFactory.initElements(driver,AccountSummaryPage.class);
		 mobileAccountPage= PageFactory.initElements(driver, MobileAccountPage.class);
	}
	@When("^User log into product and package page$")
	public void user_log_into_product_and_package_page() throws Throwable {
		homePage.click_ProductsNPackageLink();
	}
	@When("^user log into mobile page$")
	public void user_log_into_mobile_page() throws Throwable {
		mobilePage.l_click_MobileLink();
	String mobiletitle=	mobilePage.ProductAndPackageTitle();
	System.out.println("The title of mobiletitle is "+mobiletitle);
	//Assert.assertEquals("Latest Mobile Phone & Tablet Deals | Sky Mobile", mobiletitle);
	//Assert.assertEquals("Latest Mobile Phone & Tablet Deals | Sky Mobile",mobilePage.ProductAndPackageTitle());
	
	
	}
	@When("^user clicks on upgrade$")
	public void user_clicks_on_upgrade() throws Throwable {
		upgradePage.I_click_UpgradeLink();
	}

	@When("^user chooses to upgrade his account$")
	public void user_chooses_to_upgrade_his_account() throws Throwable {
		upgradePage.click_StartMygradeLink();
	}

	
/*	@Then("^user is taken to sign in page$")
	public void user_is_taken_to_sign_in_page() throws Throwable {
		String title=signinPage.validate_sign_In_Page();
		System.out.println(title);
		Assert.assertEquals("Sky - Sign in | Sky.com",signinPage.validate_sign_In_Page());
	}*/
	@Then("^user validates sign in page$")
	public void user_validates_sign_in_page() throws Throwable {
		String title=signinPage.validate_sign_In_Page();
		System.out.println(title);
		
		Assert.assertEquals("Sky - Sign in | Sky.com",title); 
	}
	@Then("^user log in entering correct \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void user_log_in_entering_correct_and(String email, String passwd) throws Throwable {
		 signinPage.type_Emailfld(email);
		 signinPage.type_Passwd(passwd);
		 signinPage.I_click_on_SignInButton();
	}
	@Then("^user confirm details is displayed$")
	public void user_confirm_details_is_displayed() throws Throwable {
	String header=	accountSummaryPage.validate_AccountSummaryHeader();
	System.out.println(header);
	//Assert.assertEquals("Welcome Odibo Christopher"
	//		+ " Here is your account summary", header);
	}

	@Then("^user attempts to link his id$")
	public void user_attempts_to_link_his_id() throws Throwable {
		accountSummaryPage.click_LinkMySkyIdIDLink();
	}

	@Then("^user validates mobile account page$")
	public void user_validates_mobile_account_page() throws Throwable {
	String text=	mobileAccountPage.validate_LinkYourMobileAccountHeader();
	System.out.println( text);
	Assert.assertEquals("Link your mobile account",text);
	}
	@When("^user attempts to continue  by entering inaccurate   \"([^\"]*)\" or \"([^\"]*)\" or \"([^\"]*)\"$")
	public void user_attempts_to_continue_by_entering_inaccurate_or_or(String surname, String postcode, String billingDetails) throws Throwable {
		mobileAccountPage.type_SurnameField(surname);
		mobileAccountPage.type_PostCodeField(postcode);JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,250)", "");
		mobileAccountPage.type_BillingDetailsField(billingDetails);
		mobileAccountPage.click_ContinueButton();
	}

	@Then("^user should see an error message$")
	public void user_should_see_an_error_message() throws Throwable {
	String errorMessage=mobileAccountPage.validate_ErrorMessage();
	System.out.println("error message is    "+errorMessage);
	System.out.println(errorMessage);
	Assert.assertEquals("We're sorry, but we don't recognise the information you've provided. Please try again.",errorMessage);
	}
}
