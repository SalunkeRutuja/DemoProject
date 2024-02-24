package Sauce.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{

	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='user-name']") WebElement uname ;
	
	@FindBy(xpath="//input[@id='password']") WebElement pass;
	
	@FindBy(xpath="//input[@id='login-button']") WebElement loginButton;
	
	@FindBy(xpath="//h3[@data-test='error']") WebElement error;
	
	public void usernamerequired(String password) {
		pass.sendKeys(password);
		loginButton.click();
		String actmsg = error.getText();
		System.out.println(actmsg);
		String expmsg= "Epic sadface: Username is required";
		Assert.assertEquals(actmsg, expmsg);
		
	}
	
	public void passwordrequired(String username) {
		driver. navigate(). refresh();
		uname.sendKeys(username);
		loginButton.click();
		String actmsg = error.getText();
		System.out.println(actmsg);
		String expmsg= "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actmsg, expmsg);
	}
	public void invalidlogin(String username, String password) {
		driver. navigate(). refresh();
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
		String actmsg = error.getText();
		System.out.println(actmsg);
		String expmsg= "Epic sadface: Password is required";
		Assert.assertEquals(actmsg, expmsg);
	}
	
	public void login(String username, String password) {
		driver. navigate(). refresh();
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	
		
	}
}
