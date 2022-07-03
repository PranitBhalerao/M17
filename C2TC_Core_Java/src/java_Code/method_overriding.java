package java_Code;

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent
{
	void property()
	{
		System.out.println("house...money..jwellery");
	}
	void marry()
	{
		System.out.println("sri lata");// definition
	}
}

class child extends Parent
{
	void marry()
	{
		System.out.println("katrina"); // new definition..overring
	}
}