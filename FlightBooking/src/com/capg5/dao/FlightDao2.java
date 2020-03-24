package com.capg5.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.capg1.bean.Flight;
import com.capg1.bean.Passenger;
import com.capg2.util.inputCollection;
import com.capg4.service.Validation;

public class FlightDao2 implements FlightDao1 
{
	Flight f1=new Flight();
	Date d=new Date();
	Scanner s=new Scanner(System.in);
	Passenger b=new Passenger();
	
inputCollection ip=new inputCollection();
	@Override
	public Flight flightDetails(String flight_number) 
	{
		Map<String,Flight> mp = ip.details();
		Flight p=mp.get(flight_number);
		return p;
		
	}
	@Override
	public Passenger addBooking() throws IOException, ParseException 
	{
		FileWriter fw=new FileWriter("TicketDetails.txt");
		
		
		int n = 10000 + new Random().nextInt(90000);//generating booking id
		fw.write("Booking id:"+n);//end
		
		System.out.println("\n\nEnter number of passengers:");
		int number=s.nextInt();
		fw.write("\nNumber of passengers :"+number);
	
		String a[]=new String[number];
		int age[]=new int[number];
		System.out.println("\nEnter the names");
		for(int i=0;i<number;i++)
		{
			System.out.print("\nEnter the name of Person "+(i+1)+" : ");
			a[i]=s.next();
			
			System.out.print("Enter the age of Person "+(i+1)+" : ");
			age[i]=s.nextInt();
			
			boolean b1 = Validation.valid(a[i],Validation.pattern);
			if(b1==true)
			{
				fw.write("\nPassenger Name:"+a[i]+"    Age:"+age[i]);
			b.setName(a[i]);
			}
			else
			{
              
		
				System.out.print("Wrong name (only alphabets allowed)\n Enter again:");
				a[i]=s.next();
				fw.write("\nPassenger Name:"+a[i]);
			}
		}
		
		int j=0;//for email validation
		
		System.out.print("\nEnter your mail:");
		while(j<3)
		{
		String mail=s.next();
		boolean b2 = Validation.validEmail(mail,Validation.pattern1);
		if(b2==true)
		{
		b.setEmail(mail);
		fw.write("\nE-mail : "+mail);
		break;
		}
		else
		{
	
			System.out.print("Wrong mail \nEnter again:");
			j++;
			
		}
		}//end
		
		 int k=0;//phone number validation start
			
			System.out.print("\nEnter your phone number:");
			while(k<3)
			{
			String phoneNumber=s.next();
			boolean b3 = Validation.validPhone(phoneNumber,Validation.pattern2);
			if(b3==true)
			{
			b.setPhone_number(phoneNumber);
			fw.write("\nPhone-no : "+phoneNumber);
			break;
			}
			else
			{
		
				System.out.print("Wrong phone \nnumber Enter again:");
				k++;
				
			}
			}//end
		
			
			int x=0;//date validation
			while(x<3)
			{
			System.out.println("\nEnter travelling date:");
			String travel_date=s.next();
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(travel_date); 
			
			boolean c=date1.after(d);
			if(c==true)
			{
				b.setTravelling_date(date1);
				fw.write("\nTravelling Date:"+date1);
				break;
			}
			else
			{
				System.out.print("Wrong date Enter again:");
				x++;
			}
			}//end
			
			
		fw.close();
		return null;
	}
	
	@Override
	public Flight searchFlight() 
	{
		System.out.println("Details of flights are:");
		System.out.println("\nFlight Number:1225   Source:Hyderabad   Destination:Gaya");
		System.out.println("Flight Number:1502   Source:Hyderabad   Destination:Pune");
		System.out.println("Flight Number:1880   Source:Delhi       Destination:Assam");
		System.out.println("Flight Number:1985   Source:Pune        Destination:Gaya");
		System.out.println("Flight Number:1526   Source:Delhi       Destination:Mumbai");
		
		return null;
	}
	@Override
	public Passenger viewBooking() throws IOException 
	{
		FileReader fr=new FileReader("TicketDetails.txt");
		int ch;
		while((ch=fr.read())!=-1)
			System.out.print((char)ch);
		return null;
	}
	
	

}
