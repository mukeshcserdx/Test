
interface InterfaceTestA {

	int a=10;
	
void abc();
}


class InterfaceTest implements InterfaceTestA {

	int a=20;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest test=new InterfaceTest();
		test.abc();
	}

	@Override
	public void abc() {
		
		// TODO Auto-generated method stub
		System.out.println(":::="+a);
	}

}
