package org.wipro.automation.uo.utilitiespkg;

import java.io.FileReader;
import java.util.Properties;

public class ReusableClass 
{

	public static String readConfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
	public static String readElementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
}
