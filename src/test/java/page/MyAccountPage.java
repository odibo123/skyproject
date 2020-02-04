package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class MyAccountPage extends TestBase{
	
	
	@FindBy(how=How.CSS, using=".mast-c-header__nav")
	WebElement LoggedInUsernameText;
	
	@FindBy(how=How.CSS, using="div.mast-c-user-actions__trigger-arrow > svg")
	WebElement UserSignOutArrow;
	
	
	@FindBy(how=How.CSS, using="#mast-user-actions > ul > li:nth-child(4) > a")
	WebElement SignOutButton;
	
	@FindBy(how=How.LINK_TEXT, using="My Account")
	WebElement AccountLink;
	
	public String validate_LoggedInUsername(){
	return	LoggedInUsernameText.getText();
	}
	
//My Account
	public void click_UserSignOut(){
		UserSignOutArrow.click();
	}
	public void click_SignOutButton(){
		SignOutButton.click();
	}
	public void click_AccountLink(){
		AccountLink.click();
	}
	
}
