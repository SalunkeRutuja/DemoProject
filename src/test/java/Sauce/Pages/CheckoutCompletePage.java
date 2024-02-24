package Sauce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	WebDriver driver;
	//constructor
	public CheckoutCompletePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h2[contains(text(),'Thank you for your order!')]") WebElement confirmtext;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") WebElement Menu;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']") WebElement Logoutopt;
	
	public void Ordercomplete() {
		confirmtext.isDisplayed();
	}
	
	public void Logout() {
		Menu.click();
		Logoutopt.click();
	}
}
