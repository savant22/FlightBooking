package com.capg2.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capg1.bean.Flight;

public class inputCollection 
{
	private static Map<String,Flight> book=new HashMap<String,Flight>();
	static {
		book.put( "1225",new Flight("08:15",1500,"Hyderabad","Gaya","1225"));
		book.put( "1502",new Flight("9:30",1200,"Hyderabad","Pune","1502"));
		book.put("1880", new Flight("13:20",1900,"Delhi","Assam","1880"));
		book.put("1985" ,new Flight("15:15",1800,"Pune","Gaya","1985"));
		book.put( "1526",new Flight("16:45",1700,"Delhi","Mumbai","1526"));
		
	}
	
	
	public static Map<String,Flight> details()
	{
		return book;
	}
}
