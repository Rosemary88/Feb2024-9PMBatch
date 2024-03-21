package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class LoginPage 
{
	WebDriver driver;  //global variable

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReusableClass.readElementprop("fb_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_login_password_name"))).sendKeys(pass);
	}
	
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReusableClass.readElementprop("fb_login_loginbttn_css"))).click();
	}
	
}
