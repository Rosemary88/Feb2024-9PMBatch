package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_loginfunction() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
	}
	
}
