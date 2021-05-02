package com.vamsi.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ORDemo
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	System.out.println("Hi");

    }

}

class OR1
{
    public OR1() throws RuntimeException
    {
	// TODO Auto-generated constructor stub
    }
    public void overrideMe() throws Exception
    {
	System.out.println("AM OR1's");
    }
}

class OR2 extends OR1
{
 public OR2() 
{
     super();
}   
 @Override
    public void overrideMe() 
    {
//	super.overrideMe();
     System.out.println();
    }
}
