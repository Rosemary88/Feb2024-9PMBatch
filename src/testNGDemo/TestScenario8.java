package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario8 
{

	@Test(groups="Smoke",priority=-1)
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(groups="Smoke",priority=-2)
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
}
