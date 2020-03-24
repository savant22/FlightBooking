package com.capg3.ui;

 class HandleException extends Exception
{
String message;

public HandleException(String message)
{
	this.message=message;
	System.out.println(message);
}
}
class NegativeNumber
{
	public static void negative(int no_of_passenger) throws HandleException
	{
		if(no_of_passenger<0)
			throw new HandleException("Please fill the correct number");
	
	}
}

class NegativeAge
{
	public static void wrongAge(int age) 
	{
		try
		{
			if(age<0)
				throw new HandleException("Please fill the correct age");	
		}
		catch (HandleException e) {
			e.getMessage();
		}
	
	
	}
}