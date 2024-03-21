package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.datagenerator.TestDataGeneartor;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario_DDF extends InitiateCloseBrowser
{

	@Test(dataProvider="static",dataProviderClass=TestDataGeneartor.class)
	public void validate_loginfunction(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
	
}
