package com.EXCEPTION;
//null pointer Exception
public class NullPointer {
	static String a=null;
	public static void main(String[] args) {
		try
		{
		
		System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		// TODO Auto-generated method stub

	}

}
