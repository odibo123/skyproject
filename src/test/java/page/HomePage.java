package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;

public class HomePage extends TestBase{
	

	@FindBy(how=How.XPATH, using="//a[@class='c-btn c-btn--secondary mast-c-btn--signin']")
	WebElement  SignInLink;
	
	@FindBy(how=How.LINK_TEXT, using="Products & Packages")
	WebElement ProductsNPackageLink;

	@FindBy(how=How.LINK_TEXT, using="Find & Watch TV")
	WebElement FindAndWatchLink;
	@FindBy(how=How.XPATH, using="//a[@class='mast-c-header__logo mast-js-focus']")
	WebElement SkyLogo;
	public void click_signInlink(){
		SignInLink.click();	
	}
	public String get_Page_Title(){
	return	driver.getTitle();
	}
	public void click_ProductsNPackageLink(){
		ProductsNPackageLink.click();
	}
	public void click_FindAndWatchLink(){
		FindAndWatchLink.click();
	}
	public String validate_SkyLogo(){
		return SkyLogo.getText();
	}
}
