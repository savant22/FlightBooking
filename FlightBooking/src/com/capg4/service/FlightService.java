package com.capg4.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.capg1.bean.Flight;
import com.capg1.bean.Passenger;

public interface FlightService 
{
Flight flightDetails(String flight_number);
Passenger addBooking() throws IOException, ParseException;
Flight searchFlight();
Passenger viewBooking() throws FileNotFoundException, IOException;
}
