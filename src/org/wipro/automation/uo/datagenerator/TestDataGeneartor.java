package org.wipro.automation.uo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGeneartor 
{

	@DataProvider(name="static")
	public Object[][] testdata()
	{
		//Object[] data1 = {"user1","pass1"};   //1-D array
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		
		return data;
	}
	
	@DataProvider(name="anotherdata")
	public Object[][] testdata2()
	{
		//Object[] data1 = {"user1","pass1"};   //1-D array
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		
		return data;
	}
	
}
