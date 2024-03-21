package oops;

public class QA2 extends QA1
{
		
	int x = 400;
	
	public void printParentData()
	{
		System.out.println(x);  //400
		
		System.out.println(super.x); //100
		
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("Sum of a&b: " + c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA2 q2=new QA2();
		q2.sum(20, 30);
		q2.sub(20,30);
		
	q2.printParentData();
		
	}


	
	public void meth_qa1i() {
System.out.println("this is QA1 method");
		
	}
	
}
