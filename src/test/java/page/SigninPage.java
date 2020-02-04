package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;

public class SigninPage extends TestBase{
	

	@FindBy(how=How.ID,using= "username")
	WebElement EmailField;
	
	
	
	@FindBy(how=How.ID,using= "password")
	WebElement passwordField;
	
	@FindBy(how=How.ID,using= "signinButton")
	WebElement LoginBtn;
	
	@FindBy(how=How.ID,using= "sign-in-userIdentifier")
	WebElement  Emailfld;
	
	@FindBy(how=How.ID,using= "sign-in-password")
	WebElement Passwd;
	
	@FindBy(how=How.ID,using= "submitButton")
	WebElement SignInButton;
	
	
	
	public void type_EmailField(String emailId){
		 EmailField.sendKeys(emailId);
	}
	public void type_passwordField(String password){
		passwordField.sendKeys(password); 
	}
	public void click_login_button(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", LoginBtn);
	}
	public String validate_sign_In_Page(){
	return	driver.getTitle();
	}
	public void type_Emailfld(String email){
		Emailfld.sendKeys(email);	
	}
	public void type_Passwd(String passwd){
		Passwd.sendKeys(passwd);
	}
	
	public void I_click_on_SignInButton(){
		SignInButton.click();
	}
}
