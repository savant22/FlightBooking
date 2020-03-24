package com.capg1.bean;

import java.util.Date;

public class Passenger 
{
private String name;
private int age;
private String phone_number;
private String email;
private int no_of_passengers;
private Date travelling_date;


public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getAge()

{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
public String getPhone_number() 
{
	return phone_number;
}
public void setPhone_number(String phone_number)
{
	this.phone_number = phone_number;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}

public int getNo_of_passengers() 
{
	return no_of_passengers;
}
public void setNo_of_passengers(int no_of_passengers) 
{
	this.no_of_passengers = no_of_passengers;
}
public Date getTravelling_date() 
{
	return travelling_date;
}
public void setTravelling_date(Date travelling_date) 
{
	this.travelling_date = travelling_date;
}




}
