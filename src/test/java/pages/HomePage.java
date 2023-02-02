package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	
	
	By logo = By.xpath("/html/body/div/div/div[1]");
	
	
	public void verifyHomePageLogo()
	{
		WebElement SwagLabsImageLogo = driver.findElement(logo);
		if(SwagLabsImageLogo.isDisplayed())
		{
			System.out.println("Swag Labs Image Logo is displayed");
		}
	}

}
