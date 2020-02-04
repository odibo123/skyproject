package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class AccountSummaryPage extends TestBase{
	
	

	@FindBy(how=How.XPATH, using="//*[@id='root']/div/header/div[1]")
	WebElement AccountSummaryHeader;
	
	@FindBy(how=How.LINK_TEXT, using="Link my Sky ID")
	WebElement  LinkMySkyIdIDLink;
	
	public String validate_AccountSummaryHeader(){
	return	AccountSummaryHeader.getText();
	}
	
	public void click_LinkMySkyIdIDLink(){
		LinkMySkyIdIDLink.click();
	}

}
