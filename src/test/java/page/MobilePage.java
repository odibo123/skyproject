package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class MobilePage extends TestBase {

	@FindBy(how=How.XPATH, using="//*[@id='mast-nav-secondary']/ul/li[7]/a")
	WebElement MobileLink;
	
	
	public void l_click_MobileLink(){
		MobileLink.click();
	}
	
	public String ProductAndPackageTitle(){
		return driver.getTitle();
	}
}
