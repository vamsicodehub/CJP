package com.vamsi.oops;

public class AbstractClassDemo {

	public static void main(String[] args) 
	{
		Vehicle vehicle = new Bike(); 
		vehicle.wheels();
		System.out.println(vehicle.returnWheels());
	}

}

abstract class Vehicle
{
	 int wheels;
	
	public Vehicle()
	{
	}
	
	public abstract int returnWheels();
	
	public void wheels()
	{
		System.out.println(wheels);
	}
}

class Bike extends Vehicle
{
	Bike()
	{
		wheels=2;
	}

	@Override
	public int returnWheels() 
	{
		return wheels;
	}
	
	public void wheels()
	{
		System.out.println(wheels);
	}
}