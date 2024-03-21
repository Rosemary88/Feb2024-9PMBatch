package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.SignUpPage;

public class SignUpScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_SignUpfunction() throws Exception
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.click_CreateNewAccount_bttn();
		sign.enter_firstname("Rose");
		sign.enter_lastname("Jose");
		sign.click_SignUp_bttn();
	}
	
}
