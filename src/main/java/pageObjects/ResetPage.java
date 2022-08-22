package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ResetPage {
		
		public ResetPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public WebDriver driver;
		private @FindBy(css="input[type='email']")
		WebElement email;
		private @FindBy(css="input[name='commit']")
		WebElement next;
		
		
		
		
		public WebElement mail()
		{
			return email;
		}
		public WebElement Next()
		{
			return next;
		}
		
			
		

}
