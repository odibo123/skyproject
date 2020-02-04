package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class UpgradePage extends TestBase{
	
	
	@FindBy(how=How.LINK_TEXT, using="Upgrade")
	WebElement UpgradeLink;
	
	@FindBy(how=How.LINK_TEXT, using="Start my upgrade")
	WebElement StartMygradeLink;
	
	
	public void I_click_UpgradeLink(){
		UpgradeLink.click();
	}
	public void click_StartMygradeLink(){
		StartMygradeLink.click();
	}

}
