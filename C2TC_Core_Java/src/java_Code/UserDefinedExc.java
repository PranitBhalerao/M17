package java_Code;

import java.util.Scanner;

public class UserDefinedExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("enter age");
		Scanner	s=new Scanner(System.in);
		age=s.nextInt();
		if(age<18)
		{
			throw new CantVote("you can not vote");
		}
		if(age>90)
		{
			System.out.println("u_r_no_more");
		}
		else
		{
			System.out.println("u can vote");
		}
	}

}
class CantVote extends RuntimeException
{

	public CantVote(String msg) {
		super(msg);
	}
}

