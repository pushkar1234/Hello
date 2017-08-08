package com.EXCEPTION;

public class ClassCast {
	
    public void display()
   {
    	System.out.println("Hii java");
   }
	public ClassCast() {
		super();
		System.out.println("Hello");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{
		ClassCast c=(ClassCast) new Object();
		//c.display();
		}
		catch(Exception e)
		{
			
			System.out.println("caught");
		}
		
		// TODO Auto-generated method stub

	}

}
