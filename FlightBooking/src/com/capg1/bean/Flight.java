package com.capg1.bean;

public class Flight 
{
private int fare;
private String source;
private String destination;
private String flight_number;
private String time;


public Flight(String time,int fare, String source, String destination, String flight_number) {
	super();
	this.fare = fare;
	this.source = source;
	this.destination = destination;
	this.flight_number = flight_number;
	this.time=time;
}

public Flight() {}
public int getFare()
{
	return fare;
}

public void setFare(int fare) 
{
	this.fare = fare;
}

public String getDestination() 
{
	return destination;
}
public void setDestination(String destination) 
{
	this.destination = destination;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getFlight_number() {
	return flight_number;
}
public void setFlight_number(String flight_number) {
	this.flight_number = flight_number;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}



}
