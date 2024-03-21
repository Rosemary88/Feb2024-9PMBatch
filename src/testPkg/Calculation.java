package testPkg;

public class Calculation 
{
	public void add()
	{
		int a = 20;
		int b  =30;
		
		int c = a+b;
		System.out.println(c);
		//return c;
	}
	
	
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	// 20+40+80 
	//int x = 20+40
	//x+80
	
	public static void main(String[] args) 
	{
	
		Calculation cal = new Calculation();  //constructor called automatically when we create object of the class
		
		Calculation cal1 = new Calculation(30, 40.5f);
		
		 cal1.add();
		
		int x = cal.sum(20, 40);
		cal.sum(x, 80);
		
		cal.sum(30, 50);
		
		
		
	} 
	
	public Calculation()
	{
		System.out.println("this is constructor without parameter");
		
		int a = 10;
		float b = 20.5f;
		float c = a+b;
		System.out.println(c);
		
		
		
	}
	
	public  Calculation(int a, float b)
	{
		System.out.println("this is constructor with parameter");
		
		float c = a+b;
		System.out.println(c);
		
		
		
	}
}
