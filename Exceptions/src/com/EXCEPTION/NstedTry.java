package com.EXCEPTION;

public class NstedTry {
	public static int main()
	{
		try
		{
			try
			{
				String str = null;
				System.out.println("lenght is :"+str.length());
			}
			finally
			{
				System.out.println("finally");
				return 20;
			}
		}
		catch(Exception e)
		{
			System.out.println("caught");
			return 5;
		}
		
	}

	public static void main(String[] args) {
		int a=main();
		System.out.println(a);
		
		// TODO Auto-generated method stub

	}

}
