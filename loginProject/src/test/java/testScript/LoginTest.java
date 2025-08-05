package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends Base {

	@Test(priority = 1)
	public void correctUsernameAndPassword() 
		{
		String loginUserName = "standard_user";
		String loginPassword = "secret_sauce";
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(loginUserName);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(loginPassword);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();	
		}
	
	@Test(priority = 2)
	public void correctUsernameInvalidPassword() 
	{
	String loginUserName = "standard_user";
	String loginPassword = "12345";
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(loginUserName);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(loginPassword);
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();	
	}
	
	@Test(priority = 3)
	public void correctPasswordIncorrectUsername() 
	{
	String loginUserName = "standard_user";
	String loginPassword = "12345";
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(loginUserName);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(loginPassword);
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();	
	}
	
	@Test(priority = 4)
	public void inCorrectUsernameAndPassword() 
	{
	String loginUserName = "standard_user";
	String loginPassword = "12345";
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(loginUserName);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(loginPassword);
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();	
	}
	
	
	
	

}
