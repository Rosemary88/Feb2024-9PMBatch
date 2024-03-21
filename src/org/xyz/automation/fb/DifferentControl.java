package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentControl 
{
	WebDriver driver;
	
	@Test
	public void launchBroser() throws Exception
	{
		
		int a = 20;
		System.out.println(a);
		
		System.out.println(20);
		
		driver = new ChromeDriver();  //launch a browser 
		
		
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebElement abc = driver.findElement(By.name("fld_username"));
		//abc.sendKeys("Selenium");
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		//con.deselectByVisibleText("United Kingdom");
		///con.deselectAll();
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
		
		boolean actState = driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(actState, false);
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //true
		
		//driver.findElement(By.className("displayPopup")).click();
	
	
	}
	
	
	
}
