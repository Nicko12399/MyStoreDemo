package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	
	public String baseURL = "https://www.saucedemo.com/";
	public String baseUsername = "standard_user";
    public String basePassword = "secret_sauce";
    
	
	public static WebDriver  driver;
	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public WebDriverWait wait;


public BasePage (WebDriver driver)
{
	this.driver = driver;
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

//Click Method
/*public void click(By by) 
{
	waitVisibility(by).click();
}

//Write Text
public void writeText(By by,String text)
{
	waitVisibility(by).senddKeys(text);
}

//Read Text
public String readText(By by)
{
	return waitVisibility(by).getText();
}

//Wait
public WebElement waitVisibility(By by)
{
	return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
}*/
}