package java_Code;

public class ExcHandling {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{
			System.out.println(arr[4]);//exception

			System.out.println("Inside try block");
			
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("outide try catch finally block....rest of the code");
		}
}
