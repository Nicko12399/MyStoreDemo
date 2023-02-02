package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomepageTest extends BaseClass{
	
	@Test
	public void homePageTest()
	{
		
		HomePage hp = new HomePage();
		
		hp.verifyHomePageLogo();
	}
	
	

}
