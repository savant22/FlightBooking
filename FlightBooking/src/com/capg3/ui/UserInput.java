package com.capg3.ui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capg1.bean.Flight;
import com.capg1.bean.Passenger;
import com.capg4.service.FlightService;
import com.capg4.service.FlightService1;
import com.capg4.service.Validation;

public class UserInput {

	public static void main(String[] args) throws HandleException, ParseException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Passenger b=new Passenger();
		FlightService1 f=new FlightService1();
		Scanner s=new Scanner(System.in);
		int choice;
		Date d=new Date();
		
		
		
		while(true)
		{
			System.out.println("\n\n--------Welcome To Indian Airways----------");
			System.out.println("\nPress 1 for flight details and ticket booking\n Press 2 for view booking\n 3 for exit");
			System.out.print("\nEnter your choice:");
			choice=s.nextInt();
			
			switch(choice)
			{
			case 1:f.searchFlight();
			System.out.println("\nEnter respective flight number to view full details:");
			      
			       String flight_number=s.next();
					
					boolean b4=Validation.validatedata(flight_number,Validation.pattern3);
					if(b4==true)
					{
						Flight p=f.flightDetails(flight_number);
						if(p!=null)
						{
							System.out.print("Time:"+p.getTime()+"   ");
							System.out.print("Flight number:"+p.getFlight_number()+"   ");
							System.out.print("Source:"+p.getSource()+"   ");
							System.out.print("Destination:"+p.getDestination()+"   ");
							System.out.print("Fare per person:"+p.getFare());
						}
						else 
						{
							System.out.println("Not Valid Flight Number");
							}
						
						 f.addBooking();
						}
			break;
			
			case 2:f.viewBooking();
			break;
			
			
			
			
			case 3:System.exit(0);
			}
		}
		

}
}




