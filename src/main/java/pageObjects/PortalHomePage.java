package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PortalHomePage {
		
		public PortalHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public WebDriver driver;
		By searchbox =By.name("query");
		
		public WebElement getSearchBox()
		{
			return driver.findElement(searchbox);
		}
		
			
		

}
