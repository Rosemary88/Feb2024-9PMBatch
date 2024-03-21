package oops;

public class CallInterface implements DemoInterface
{

	int a = 20;
	//a=30;
	
	
	public void meth3() {
		System.out.println("method3");
	}

	
	public void meth4() {
		
		
		int a = 20;
		a=30;
		System.out.println("method4");
	}

	
	public void meth5() {
		System.out.println("method5");
		
	}

	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
		ci.meth4();
		ci.meth5();
	}


	
	public void tc02_validateLoginPage() {
		System.out.println("this is my test case");
		
	}
	
	
}
