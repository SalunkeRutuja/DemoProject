package Sauce.Testcases;

import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.CartPage;
import Sauce.Pages.CheckoutPage;
import Sauce.Pages.LoginPage;
import Sauce.Pages.ProductPage;

public class CheckoutTest extends BaseTest {

LoginPage lp = new LoginPage(driver);
	
	ProductPage pp = new ProductPage(driver);
	
	CartPage cp = new CartPage(driver);
	
	CheckoutPage chp = new CheckoutPage(driver);
	
	@Test
	public void VerifyFirstnameRequiredError() {
		LoginPage lp=new LoginPage(driver);
		String username ="standard_user";
		String password ="secret_sauce";
		lp.login(username, password);
		
		pp.addproduct();
		pp.carticonfunction();
		String Lastn = "Gates";
		String Pin = "123212";
		chp.FirstNameRequired(Lastn, Pin);
	}
	
	@Test
	public void VerifyLastnameRequiredError() {
		String Firstn = "Bill";
		String Pin = "123212";
		chp.LastNameRequired(Firstn, Pin);
	}
	
	@Test
	public void VerifyPostalcodeRequiredError() {
		String Firstn = "Bill";
		String Lastn = "Gates";
		chp.PostalcodeRequired(Firstn, Lastn);
		
	}
	
	@Test
	public void VerifyCancelBtnFunctionality() {
		chp.cancelbtnfunction();
		cp.checkoutbtnfunction();
	}
	@Test
	public void VerifyCheckoutwithValidCreds() {
		String Firstn = "Bill";
		String Lastn = "Gates";
		String Pin = "123212";
		chp.Validcreds(Firstn, Lastn, Pin);
	}
}
