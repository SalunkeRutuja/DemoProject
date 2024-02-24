package Sauce.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	//constructor
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='first-name']") WebElement Firstn;
	
	@FindBy(xpath="//input[@id='last-name']") WebElement Lastn;
	
	@FindBy(xpath="//input[@id='postal-code']") WebElement Pin;
	
	@FindBy(xpath="//h3[@data-test='error']") WebElement errormsg;
	
	@FindBy(xpath="//button[@id='cancel']") WebElement cancelbtn;
	
	@FindBy(xpath="//input[@id='continue']") WebElement continuebutton;
	
	public void FirstNameRequired(String lastname, String postalcode) {
		Lastn.sendKeys(lastname); 
		Pin.sendKeys(postalcode);
		continuebutton.click();
		String actmsg = errormsg.getText();
		System.out.println(actmsg);
		String expmsg= "Error: First Name is required";
		Assert.assertEquals(actmsg, expmsg);
	}
	
	public void LastNameRequired(String firstname, String postalcode) {
		driver.navigate().refresh();
		Lastn.sendKeys(firstname); 
		Pin.sendKeys(postalcode);
		continuebutton.click();
		String actmsg = errormsg.getText();
		System.out.println(actmsg);
		String expmsg= "Error: Last Name is required";
		Assert.assertEquals(actmsg, expmsg);
}
	public void PostalcodeRequired(String firstname, String lastname) {
		Firstn.sendKeys(firstname); 
		Lastn.sendKeys(lastname);
		continuebutton.click();
		String actmsg = errormsg.getText();
		System.out.println(actmsg);
		String expmsg= "Error: Postal Code is required";
		Assert.assertEquals(actmsg, expmsg);
	
	}
	public void Validcreds(String firstname, String lastname, String postalcode) {
		Firstn.sendKeys(firstname); 
		Lastn.sendKeys(lastname);
		Pin.sendKeys(postalcode);
		continuebutton.click();
	}
	
	public void cancelbtnfunction() {
		cancelbtn.click();
	}
}
	
