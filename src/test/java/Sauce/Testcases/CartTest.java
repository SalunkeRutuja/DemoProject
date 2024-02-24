package Sauce.Testcases;

import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.CartPage;
import Sauce.Pages.LoginPage;
import Sauce.Pages.ProductPage;

public class CartTest extends BaseTest {

	LoginPage lp = new LoginPage(driver);
	
	ProductPage pp = new ProductPage(driver);
	
	CartPage cp = new CartPage(driver);
	
	@Test
	public void VerifyRemoveproduct() {
		LoginPage lp=new LoginPage(driver);
		String username ="standard_user";
		String password ="secret_sauce";
		lp.login(username, password);
		
		pp.addproduct();
		pp.carticonfunction();
		cp.removeproduct();
	}
	
	@Test
	public void VerifyContineBtnFunctionality() {
		cp.continuebtnfuntion();
		pp.carticonfunction();
	}
	
	@Test
	public void VerifyCheckoutBtnFunctionality() {
		cp.checkoutbtnfunction();
	}
}
