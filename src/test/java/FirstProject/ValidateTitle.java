package FirstProject;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import pageObjects.LandingPage;

import resources.base;

public class ValidateTitle extends base{
	public WebDriver driver;
	LandingPage lp;
	public static Logger log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is Initialized");
		
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		driver.get("https://rahulshettyacademy.com/");
		log.info("Navigated to Landing Page");
		//LandingPage lp=new LandingPage(driver);//in the beginning
		lp=new LandingPage(driver);//now
		Assert.assertEquals(lp.getTitle().getText(),"Featured Courses");
		log.info("Successfully validated Title");
		Assert.assertTrue(lp.getPractice().isDisplayed());
		
			
	}
	@Test
	public void validateHeader() throws IOException
	{
		
		log.info("Navigated to header Page");
		
		Assert.assertEquals(lp.getHeader().getText(),"An Academy to Learn Earn & Shine  in your QA Career");
		log.info("Successfully validated Header");
		
		
			
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
