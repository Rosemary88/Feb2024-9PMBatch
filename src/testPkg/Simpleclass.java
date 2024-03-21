package testPkg;

public class Simpleclass 
{
	int a =10;  //global variable
	//a=20;
	
	float b = 10.5f;
	
	char c = 'X';
	
	String d = "Java";
	
	boolean e = false;
	
	public void printdata()
	{
		 int a  =100;  //local variable  //constant
		a=200;
		a=-2;
		
		char c = 'X';
		c='Y';
		
		System.out.println(a);  //100
		
		System.out.println(b);
		System.out.println(c);
				
	}
	
	public void meth2()
	{
		System.out.println(a);  //10
	}
	
	
	public static void main(String[] args) {
		Simpleclass sc=new Simpleclass();
		sc.printdata();
		sc.meth2();
	}
}