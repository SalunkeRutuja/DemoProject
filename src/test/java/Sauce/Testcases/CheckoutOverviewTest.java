package Sauce.Testcases;

import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.CartPage;
import Sauce.Pages.CheckoutOverviewPage;
import Sauce.Pages.CheckoutPage;
import Sauce.Pages.LoginPage;
import Sauce.Pages.ProductPage;

public class CheckoutOverviewTest extends BaseTest {

LoginPage lp = new LoginPage(driver);
	
	ProductPage pp = new ProductPage(driver);
	
	CartPage cp = new CartPage(driver);
	
	CheckoutPage chp = new CheckoutPage(driver);
	
	CheckoutOverviewPage cop = new CheckoutOverviewPage(driver);
	
	@Test
	public void VerifyPaymentInfoTextDisplayed() {
		LoginPage lp=new LoginPage(driver);
		String username ="standard_user";
		String password ="secret_sauce";
		lp.login(username, password);
		
		pp.addproduct();
		pp.carticonfunction();
		cp.checkoutbtnfunction();
		String Firstn = "Bill";
		String Lastn = "Gates";
		String Pin = "123212";
		chp.Validcreds(Firstn, Lastn, Pin);
		
		cop.PaymentInfoText();
	}
	@Test
	public void VerifyPaymentSubTextDisplayed(){
		cop.PaymentSubText();
	}
	@Test
	public void VerifyShipInfoTextDisplayed() {
		cop.ShipInfoText();
	}
	@Test
	public void VerifyShipnoteTextDisplayed() {
		cop.ShipnoteText();
	}
	
	@Test
	public void VerifyPricetotTextDisplayed() {
		cop.PricetotText();
	}
	
	@Test
	public void VerifyTotalTextDisplayed() {
		cop.TotalText();
	}
	
	@Test
	public void VerifyFinishButtonFunctionality() {
		cop.FinishButtonFunction();
	}
}
