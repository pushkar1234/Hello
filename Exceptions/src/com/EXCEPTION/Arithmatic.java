package com.EXCEPTION;

public class Arithmatic {

	public static void  main(String[] args) {
		int ans=Arithmatic.display();
		System.out.println(ans);
		

	}

	private static int display() {
		try
		{
		int a=10;
		int b=a/0;
		System.out.println(a);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exeption caught");
			return 10;
		}
		finally
		{
			System.out.println("hi git my change is new");
			System.out.println("finally");
			return 5;
		}
		
	}

}
