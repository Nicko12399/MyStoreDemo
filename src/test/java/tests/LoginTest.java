package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest()
	{
		LoginPage lp = new LoginPage();
		
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();
	}
	
}
