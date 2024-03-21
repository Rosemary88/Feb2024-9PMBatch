package oops;

public class CallAbsclass extends AbsClassDemo
{

	
	public void meth2() 
	{
		
		System.out.println("this is my password");
		
	}

	public static void main(String[] args) {
		
		CallAbsclass abc = new CallAbsclass();
		abc.meth1();
		abc.meth2();
	}
	
}
