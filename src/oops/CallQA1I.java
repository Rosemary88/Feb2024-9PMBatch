package oops;

public class CallQA1I implements QA1I
{

	
	public void meth1_QA1()
	{
		System.out.println("this is interface method");
		
	}

	
	public static void main(String[] args) {
		CallQA1I q1 = new CallQA1I();
		q1.meth1_QA1();
	}


	@Override
	public void meth_qa1i() {
		// TODO Auto-generated method stub
		
	}
	
}
