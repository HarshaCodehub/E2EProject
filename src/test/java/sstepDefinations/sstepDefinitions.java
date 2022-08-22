package sstepDefinations;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class sstepDefinitions extends base {

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
		driver=initializeDriver();
	}

	@And("^navigate to \"([^\"]*)\" site.$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get("https://rahulshettyacademy.com/");
	}

	@And("^click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		//lp.getOut().click();
		
		LoginPage lop=lp.getLogin();
	}

	 @When("^user enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LandingPage lp=new LandingPage(driver);
		LoginPage lop=lp.getLogin();
		Thread.sleep(1000);
		lop.Email().sendKeys(username);
		lop.Password().sendKeys(password);
		//System.out.println(text);
		lop.Submit().click();
	}

	@Then("^verify the user is successfully logged in$")
	public void verify_the_user_is_successfully_logged_in() throws Throwable {
		PortalHomePage php=new PortalHomePage(driver);
		Assert.assertTrue(php.getSearchBox().isDisplayed());
	}

}
