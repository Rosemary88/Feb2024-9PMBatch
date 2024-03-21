package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class SignUpPage 
{
	WebDriver driver;  //global variable

	public SignUpPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_CreateNewAccount_bttn() throws Exception
	{
		driver.findElement(By.xpath(ReusableClass.readElementprop("fb_login_createnewaccount_xpath"))).click();
	}
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_lastname_name"))).sendKeys(lname);
	}
	
	public void click_SignUp_bttn() throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_signupbtn_name"))).click();
	}
	
}
