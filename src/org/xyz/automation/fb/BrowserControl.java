package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{
	WebDriver driver;
	
	@Test
	public void launchBroser() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a browser 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("user2.com");
		
		/*
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//driver.close(); //close the window
		driver.quit(); //close all the window 
		*/
	
		
	}
	
	
	
}
