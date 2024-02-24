package Sauce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

	WebDriver driver;
	//constructor
	public CheckoutOverviewPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="xpath=//a[contains(text(),'Payment Information')]") WebElement Payinfo;
	
	@FindBy(linkText="xpath=//a[contains(text(),'SauceCard #31337')]") WebElement Paymentsubtext;
	
	@FindBy(linkText="xpath=//a[contains(text(),'Shipping Information')]") WebElement Shipinfo;
	
	@FindBy(linkText="xpath=//a[contains(text(),'Free Pony Express Delivery!')]") WebElement Shipnote;
	
	@FindBy(linkText="xpath=//a[contains(text(),'Price Total')]") WebElement Pricetot;
	
	@FindBy(className="summary_info_label summary_total_label") WebElement Total;
	
	@FindBy(xpath="//button[@id='finish']") WebElement Finishbtn;
	
	public boolean PaymentInfoText() {

		boolean payment= Payinfo.isDisplayed();
		Payinfo.isDisplayed();
		return payment;

	}
	
	public boolean PaymentSubText() {

		boolean payment= Paymentsubtext.isDisplayed();
		Paymentsubtext.isDisplayed();
		return payment;

	}
	
	public boolean ShipInfoText() {

		boolean payment= Shipinfo.isDisplayed();
		Shipinfo.isDisplayed();
		return payment;

	}
	
	public boolean ShipnoteText() {

		boolean payment= Shipnote.isDisplayed();
		Shipnote.isDisplayed();
		return payment;

	}
	
	public boolean PricetotText() {

		boolean payment= Pricetot.isDisplayed();
		Pricetot.isDisplayed();
		return payment;

	}
	
	public boolean TotalText() {

		boolean payment= Total.isDisplayed();
		Total.isDisplayed();
		return payment;

	}
	public void FinishButtonFunction() {
		Finishbtn.click();
	}
	}
	


