package com.capg4.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.capg1.bean.Flight;
import com.capg1.bean.Passenger;
import com.capg5.dao.FlightDao2;

public class FlightService1 implements FlightService 
{
FlightDao2 dao=new FlightDao2();
	@Override
	public Flight flightDetails(String flight_number) 
	{
		
		return dao.flightDetails(flight_number);
	}
	@Override
	public Passenger addBooking() throws IOException, ParseException 
	{
		
		return dao.addBooking();
	}
	@Override
	public Flight searchFlight() 
	{
		
		return dao.searchFlight();
	}
	@Override
	public Passenger viewBooking() throws IOException {
		
		return dao.viewBooking();
	}

}
