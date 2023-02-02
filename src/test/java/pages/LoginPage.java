package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	By username = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input");
	By password = By.xpath("//*[@id=\"password\"]");
	By LoginButton = By.xpath("//*[@id=\"login-button\"]");
	
	
	public void enterUsername()
	{
		driver.findElement(username).sendKeys(baseUsername);
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys(basePassword);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(LoginButton).click();
		
	}
	

}
