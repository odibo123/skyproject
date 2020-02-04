package stepDefinition;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page.HomePage;
//import cucumber.api.java.en.When;

public class Common extends TestBase{

	private HomePage homePage;
	public Common (){
		homePage= PageFactory.initElements(driver,  HomePage.class);
		
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		TestBase.initialization(); 
		driver.manage().window().maximize();
	String title=	homePage.get_Page_Title();
	System.out.println(title);
	Assert.assertEquals("Sky TV, Broadband & Mobile | News, Sports & Movies | Sky.com", title);
	}
	


}
