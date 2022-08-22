package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	@FindBy(xpath="(//div/a)[2]")
	private WebElement login;
	//@FindBy(xpath="//button[text()='NO THANKS']")
	//WebElement popout;
	@FindBy(xpath="(//div/h2)[2]")
	private WebElement title;
	private @FindBy(linkText="Practice")//encapsulation
	WebElement practice;
	@FindBy(xpath="(//div/h2)[1]")
	private WebElement header;
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  LoginPage getLogin()
	{
	  login.click();
	  LoginPage lop=new LoginPage(driver);
	  return lop;
	}
	/*public WebElement getOut()
	{
		return popout;
	}*/
	public WebElement getTitle()
	{
		return title;
	}

	public WebElement getPractice() {
		// TODO Auto-generated method stub
		return practice;
	}
	public WebElement getHeader()
	{
		return header;
	}
	

}
