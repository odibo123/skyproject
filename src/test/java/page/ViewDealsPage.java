package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class ViewDealsPage extends TestBase{

	@FindBy(how=How.CSS,using= "#mast-nav-secondary > ul > li:nth-child(8) > ul > li:nth-child(6) > a")
	WebElement ViewDealLink;
	
@FindBy(how=How.CSS,using= "#section-2 > div:nth-child(2) > div.skycom-4.skycom-offset.default.alpha.image-top > div.pricePod > a")
WebElement  BuyIphone11Tab;
	
	
@FindBy(how=How.CSS,using= "#section-2 > div:nth-child(2) > div:nth-child(2) > div.pricePod > a")
	WebElement  BuyIphone11ProTab;


@FindBy(how=How.CSS,using= "#section-2 > div:nth-child(2) > div:nth-child(3) > div.pricePod > a")
WebElement  BuyIphone11ProProMaxTab;

public void click_ViewDealLink(){
	ViewDealLink.click();
}
/*public void click_BuyIphone11Tab(){
	BuyIphone11Tab.click();
}*/

public void click_BuyIphone11ProTab(){
	 BuyIphone11ProTab.click();
}
public void click_BuyIphone11ProProMaxTab(){
	BuyIphone11ProProMaxTab.click();
}
public void I_shouldclickBuyIphone11Tab(){
	BuyIphone11Tab.click();
}
}
