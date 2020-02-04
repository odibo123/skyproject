package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class MobileAccountPage extends TestBase{
	
	@FindBy(how=How.CSS,using= "#app-content > span:nth-child(1) > div > div > div > div > div:nth-child(3) > div > div > h3")
	WebElement LinkYourMobileAccountHeader;
	
	@FindBy(how=How.ID,using= "LINK_SKY_ID_FORM-linkSkyId-surname")
	WebElement  SurnameField;
	
	@FindBy(how=How.CSS,using= "#app-content > span:nth-child(1) > div > div > div > div > div:nth-child(3) > div > div > div > p")
	WebElement ErrorMessage;
	
	@FindBy(how=How.ID,using= "LINK_SKY_ID_FORM-linkSkyId-postcode")
	WebElement  PostCodeField;
	
	@FindBy(how=How.ID,using= "LINK_SKY_ID_FORM-linkSkyId-accountNumber")
	WebElement BillingDetailsField; 
	
	@FindBy(how=How.CSS,using= "#submitButton")
	WebElement ContinueButton;
	public String validate_LinkYourMobileAccountHeader(){
		return LinkYourMobileAccountHeader.getText();
	}
	public void type_SurnameField(String surname){
		SurnameField.sendKeys(surname);
	}
	public void type_PostCodeField(String postcode){
		PostCodeField.sendKeys(postcode);
	}
public void type_BillingDetailsField(String billingDetails){
	BillingDetailsField.sendKeys(billingDetails);
}
public void click_ContinueButton(){
	ContinueButton.click();
}
public String validate_ErrorMessage(){
	return ErrorMessage.getText();
}
}
