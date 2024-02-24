package Sauce.Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.LoginPage;
import Sauce.Pages.ProductPage;

public class ProductTest extends BaseTest{

	LoginPage lp = new LoginPage(driver);
	
	ProductPage pp = new ProductPage(driver);
	
	@Test
	public void VerifyAddProduct() {
		LoginPage lp=new LoginPage(driver);
		String username ="standard_user";
		String password ="secret_sauce";
		lp.login(username, password);
		
		pp.addproduct();
	}
	
	@Test
	public void VerifyProductSort() {
		pp.sortproducts();
	}
	
	@Test
	public void VerifyProductsOnPage() {
		pp.productsOnPage();
	}
	
	@Test
	public void VerifyImagesOnPage() {
		pp.imagesOnPage();
	}
	
	@Test
	public void VerifyTwittericonFunctionality() 
	{
		pp.twitterIconFunction();
	}
	
	@Test
	public void VerifyFacebookIconFunctionality() {
		pp.facebookIconFunction();
	}
	
	@Test
	public void VerifyLinkedinIconFunctionality() {
		pp.linkedinIconFunction();
	}
	
	@Test
	public void VerifyCarticonFunctionality() {
		pp.carticonfunction();
	}
}
