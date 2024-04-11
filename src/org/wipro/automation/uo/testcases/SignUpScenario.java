package org.wipro.automation.uo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.SignUpPage;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class SignUpScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_SignUpfunction() throws Exception 
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.click_CreateNewAccount_bttn();
		sign.enter_firstname("Rose");
		sign.enter_lastname("Jose");
		sign.enter_Mobilenumber("3124567894");
		sign.enter_Newpass("vajk1234");
		sign.enter_Birth_month("Jun");
		sign.enter_Birth_day("16");
		sign.enter_Birth_year("2000");
		driver.findElement(By.cssSelector("input[value='1']")).click(); //gender(Female value=1, Male value=2, Custom value=-1)
		sign.click_SignUp_bttn();
	}
	
}
