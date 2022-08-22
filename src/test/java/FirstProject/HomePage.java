package FirstProject;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ResetPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is Initialized");
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String pass) throws IOException, InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/");
		log.info("Navigated to Home Page");
		LandingPage lp=new LandingPage(driver);
		//lp.getOut().click();
		LoginPage lop=lp.getLogin();
		lop.Email().sendKeys(username);
		lop.Password().sendKeys(pass);
		//System.out.println(text);
		log.info("Passed");
		lop.Submit().click();
		ResetPage reset=lop.Forgot();
		lop.Forgot();
		reset.mail().sendKeys("harsha123@gmail.com");
		reset.Next().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="rescricteduser@gmail.com";
		data[0][1]="dummyPassword";
		//data[0][2]="dummyuser";
		
		data[1][0]="trueuser@gmail";
		data[1][1]="truepassword";
		//data[1][2]="legituser";
		return data;
		
				
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
