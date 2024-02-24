package Sauce.Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import Sauce.Pages.BaseTest;
import Sauce.Pages.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage lp = new LoginPage(driver);
	
	@Test
	public void VerifyUsernameRequiredError() {
		String password = "secret_sauce";
		lp.usernamerequired(password);
		
	}
	@Test
	public void VerifypasswordRequiredError() {
		String username = "standard_user";
		lp.passwordrequired(username);
	}
	
	@Test
	public void VerifyInvalidLogin() {
		String username = "demo";
		String password = "1234";
		lp.invalidlogin(username, password);
				
	}
	@Test
	public void VerifyLogin() {
		LoginPage lp=new LoginPage(driver);
		String username ="standard_user";
		String password ="secret_sauce";
		lp.login(username, password);
		
		if(username.equals("standard_user") && password.equals("secret_sauce"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
}
