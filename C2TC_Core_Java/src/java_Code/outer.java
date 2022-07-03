package java_Code;

public class outer {
	static int x =10;
						static class Inner
						{
							public void demo () {
								System.out.println("I am inner class");
								x=100;
								System.out.println(x);
							}
						}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.Inner obj = new outer.Inner();
		      obj.demo();
	}

}
