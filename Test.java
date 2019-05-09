
public class Test {

		int data=50;//instance variable  
		static int m=100;//static variable 
		
		void method()
		{
					data=75;
					m=110;
				int n=90;//local variable  
				System.out.println("data="+data);
				System.out.println("m="+m);
				System.out.println("n="+n);
		} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.method();
		t.data=80;
		t.m=115;
		System.out.println("data="+t.data);
		System.out.println("m="+t.m);
		

	}

}
