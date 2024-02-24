package Sauce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	//constructor
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") WebElement removeproductbtn;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") WebElement continuebtn;
	
	@FindBy(xpath="//button[@id='checkout']") WebElement checkoutbtn;
	
	public void removeproduct() {
		removeproductbtn.click();
	}
	
	public void continuebtnfuntion() {
		continuebtn.click();
		
	}
	
	public void checkoutbtnfunction() {
		checkoutbtn.click();
	}
}
