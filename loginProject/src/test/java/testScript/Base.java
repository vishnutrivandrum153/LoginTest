package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver driver;

@BeforeMethod
	// This annotation is used to indicate that the method should be run before each test method
public void browserInitilization() 
	{	
		driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize(); 
	}

@AfterMethod
public void browserQuitAndClose()
	{
		driver.quit(); //close all window
		//driver.close(); //close current window
	}
	
}
