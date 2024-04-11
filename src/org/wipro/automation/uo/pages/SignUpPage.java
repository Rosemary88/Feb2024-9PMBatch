package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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
	
	public void enter_Mobilenumber(String mnum) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_Mob_Num_name"))).sendKeys(mnum);
	}
	
	public void enter_Newpass(String npass) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_New_pass_name"))).sendKeys(npass);
	}
	
	public void enter_Birth_month(String month) throws Exception
	{
		Select mon = new Select(driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_birth_month_name"))));
		mon.selectByVisibleText(month);
	}
	
	public void enter_Birth_day(String day) throws Exception
	{
		Select days = new Select(driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_birth_day_name"))));
		days.selectByVisibleText(day);
	}
	
	public void enter_Birth_year(String year) throws Exception
	{
		Select years = new Select(driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_birth_year_name"))));
		years.selectByVisibleText(year);
	}
	
	
	public void click_SignUp_bttn() throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_signupbtn_name"))).click();
	}
	
}
