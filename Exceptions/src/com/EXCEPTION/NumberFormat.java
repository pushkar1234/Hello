package com.EXCEPTION;

public class NumberFormat {

	public static void main(String[] args) {
		try
		{
		String a="pushkar";
		int i=Integer.parseInt(a);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Caught");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
