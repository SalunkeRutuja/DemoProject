package Sauce.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	WebDriver driver;
	//constructor
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement product1;
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement product2;
	
	@FindBy(className="product_sort_container") WebElement sort;
	
	@FindBy(xpath="//a[contains(text(),'Twitter')]") WebElement twittericon;
	
	@FindBy(xpath="//a[contains(text(),'Facebook')]") WebElement facebookicon;
	
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]") WebElement linkedinicon;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") WebElement product1title;
	
	@FindBy(xpath="//div[@class='inventory_list']/child:: div") WebElement products;
	
	@FindBy(xpath="//div[@class='inventory_list']/child:: div/child::div/child::a") WebElement images;
		
	@FindBy(className="shopping_cart_link") WebElement carticon;
	
	public void addproduct() {
		product1.click();
		product2.click();
	}
	
	public void sortproducts() {
		Select sel = new Select(sort);
		sel.selectByValue("za");
	}
	public boolean twitterIconFunction() {

		boolean twitter= twittericon.isDisplayed();
		twittericon.click();
		driver.close();
		return twitter;
		
	}
	public boolean facebookIconFunction() {

		boolean facebook= facebookicon.isDisplayed();
		facebookicon.click();
		driver.close();
		return facebook;

	}
	public boolean linkedinIconFunction() {

		boolean linkedin= linkedinicon.isDisplayed();
		linkedinicon.click();
		driver.close();
		return linkedin;

	}
	
	public List<WebElement> productsOnPage()
	{
		List<WebElement> products= productsOnPage();
		System.out.println(products.size());
		return products;
	}
	
	public List<WebElement> imagesOnPage()
	{
		List<WebElement> images= imagesOnPage();
		System.out.println(images.size());
		return images;
		
	}
	
	public void carticonfunction() {
		carticon.click();
	}

	
}
