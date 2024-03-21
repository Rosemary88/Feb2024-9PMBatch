package oops;

public class QA4 extends QA2 implements QA3I
{
	public void div(int a, int b)
	{
		int c = a/b;
	
		System.out.println("division of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		
		QA4 q4=new QA4();
		q4.sum(20, 30);
		q4.sub(20,30);
		q4.div(30, 15);
	
		
	}

	public void meth1_QA3I() 
	{
	
		System.out.println("this is QA3 Interface method");
		
	}
	
}
