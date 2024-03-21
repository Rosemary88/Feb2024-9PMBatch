package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBroser()
	{
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();  //launch a browser
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		
	}
	
	@AfterMethod
	public void closeBroswer()
	{
		driver.close();
	}

	@Test
	public void loginFUnctionailty()
	{
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test
	public void signupFUnctionailty() throws Exception
	{
		
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}	
	
	
	
}
