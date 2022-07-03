package java_Code;

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.m(10l);
		t.m();
		t.m(65);
		t.m(56.2);
		t.m('b');// method call searched in compiler
	}

}

class Test
{
	public void m ()
	{
	System.out.println("no arguments");	
	}
	public void m (int i)
	{
	System.out.println("integer arguments");
	}
	public void m (double d)
	{
	System.out.println("double arguments");	
	}
}