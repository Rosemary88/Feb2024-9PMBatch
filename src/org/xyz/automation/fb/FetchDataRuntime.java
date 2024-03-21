package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	@Test
	public void launchBroser() throws Exception
	{
		driver = new ChromeDriver();  //launch a browser 
		
		String ExpectedURL = "https://www.facebook.com/";
		
		driver.get(ExpectedURL);
		
		//Step1
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpectedURL);  //hard assertion
		//SoftAssertion 
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpectedURL);
		
		System.out.println("this test case execution completed");
		
		//Step2
		String ExpectedTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpectedTitle);
		
		String expectedUsernameField = "Email address or phone number";
		String Actusernamefiedl = driver.findElement(By.id("email")).getAttribute("placeholder");
		driver.findElement(By.id("email")).sendKeys("user1");
		System.out.println(Actusernamefiedl);
		sa.assertEquals(Actusernamefiedl, expectedUsernameField);
		
		String ExpectedLoginBtn = "Log in";
		String ActLoginBtn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginBtn);
		sa.assertEquals(ActLoginBtn, ExpectedLoginBtn);
		
		Point locLogin = driver.findElement(By.name("login")).getLocation();
		System.out.println(locLogin);
		//System.out.println(driver.getPageSource());
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		
		driver.close();
		
		
		sa.assertAll();
	}
	
	
	
}
