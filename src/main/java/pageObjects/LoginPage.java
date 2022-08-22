package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public WebDriver driver;
		@FindBy(xpath="//input[@name='email']")
		private WebElement email;
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		@FindBy(xpath="//input[@name='commit']")
		private WebElement submit;
		@FindBy(linkText="Forgot Password")
		private WebElement forgot;
		
		
		
		public WebElement Email()
		{
			return email;
		}
		public WebElement Password()
		{
			return password;
		}
		public WebElement Submit() {
			// TODO Auto-generated method stub
			return submit;
		}
		public ResetPage Forgot()
		{
			 forgot.click();
			ResetPage reset=new ResetPage(driver);
			 return reset;
		}
			
		

}
