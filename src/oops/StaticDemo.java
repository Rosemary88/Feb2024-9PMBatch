package oops;

public class StaticDemo 
{
	static int a = 20;

	public static void printData()
	{
		
		System.out.println(a);
	}
	
	public void meth2()
	{
		System.out.println(a);
		System.out.println("this is non-static");
	}
	
	public static void main(String[] args) {
		
		
		StaticDemo.printData();
		
		StaticDemo sd = new StaticDemo();
		sd.meth2();
		
	}
	
}
