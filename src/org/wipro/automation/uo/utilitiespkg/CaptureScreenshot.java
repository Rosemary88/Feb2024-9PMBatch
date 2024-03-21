package org.wipro.automation.uo.utilitiespkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

		
	public static void testresults(WebDriver driver, String data) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;   //take screenshot/ prt sc
		
		File f = ts.getScreenshotAs(OutputType.FILE);
				
		File fd = new File("./Screenshot/" + data + ".png");
		
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
}
