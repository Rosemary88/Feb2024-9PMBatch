package org.wipro.automation.uo.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class InitiateCloseBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReusableClass.readConfigprop("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReusableClass.readConfigprop("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.get(ReusableClass.readConfigprop("Application_URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
