package com.EXCEPTION;

import java.util.Scanner;

public class ArrayIndexOutOfBond {
	public static void display()
	{
		try
		{
			int[] a=new int[5];
			Scanner s=new Scanner(System.in);
			System.out.println("Enter elements");
			for(int i=0;i<=a.length;i++)
			{
				a[i]=s.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ArrayIndexOutOfBond.display();
		// TODO Auto-generated method stub

	}

}
