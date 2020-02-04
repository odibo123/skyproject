package stepDefinition;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page.HomePage;

public class SkyArts extends TestBase{
	
	private HomePage homePage;
	
	public SkyArts(){
		homePage= PageFactory.initElements(driver, HomePage.class);
	}
	
	@Given("^user confirms seeing logo banner$")
	public void user_confirms_seeing_logo_banner() throws Throwable {
	String y=	homePage.validate_SkyLogo();
	System.out.println(y);
	}
@When("^User log into Find And Watch Page$")
public void user_log_into_Find_And_Watch_Page() throws Throwable {
	Thread.sleep(5000);
	homePage.click_FindAndWatchLink();
}

@When("^user log into Sky art page$")
public void user_log_into_Sky_art_page() throws Throwable {

}

@When("^user chooses a movie of choice$")
public void user_chooses_a_movie_of_choice() throws Throwable {
   
}


}
