package com.EXCEPTION;

public class NoClassDefFoundError {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 Object o=Class.forName("D").newInstance();
		
		

	}

}
