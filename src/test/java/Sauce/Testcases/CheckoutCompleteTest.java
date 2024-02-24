package Sauce.Testcases;

import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.CartPage;
import Sauce.Pages.CheckoutCompletePage;
import Sauce.Pages.CheckoutOverviewPage;
import Sauce.Pages.CheckoutPage;
import Sauce.Pages.LoginPage;
import Sauce.Pages.ProductPage;

public class CheckoutCompleteTest extends BaseTest{

LoginPage lp = new LoginPage(driver);
	
	ProductPage pp = new ProductPage(driver);
	
	CartPage cp = new CartPage(driver);
	
	CheckoutPage chp = new CheckoutPage(driver);
	
	CheckoutOverviewPage cop = new CheckoutOverviewPage(driver);
	
	CheckoutCompletePage ccp = new CheckoutCompletePage(driver);
	
	@Test
	public void VerifyOrderCompleteConfirmation() {
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
		cop.FinishButtonFunction();
		ccp.Ordercomplete();
	}
	@Test
	public void Logout() {
		ccp.Logout();
	}
}
