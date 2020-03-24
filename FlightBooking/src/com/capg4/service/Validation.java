package com.capg4.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Validation 
{
	String pattern="^[a-zA-Z]*$";
	public static boolean valid(String name,String pattern)
	{
	
		return name.matches(pattern);
	
	}
	
	String pattern1="^(.+)@(.+)$";
	public static boolean validEmail(String mail,String pattern1)
	{
		return mail.matches(pattern1);
	}
	
	String pattern2="^[8-9][0-9]{9}";
	public static boolean validPhone(String phoneNumber,String pattern2)
	{
		return phoneNumber.matches(pattern2);
	}
	
	String pattern3="[1-9][0-9][0-9][0-9]";
	public static boolean validatedata(String flight_number,String pattern3)
	{
		return flight_number.matches(pattern3);
	}
}
