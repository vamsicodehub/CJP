package com.vamsi.interview;

public class FibonacciDemo
{

    public static void main(String[] args)
    {
	int f0=0;
	int f1=1;
	
	System.out.print(f0+" "+f1+" ");
	int f2 ;
	
	int n=10;
	
	while(n>2)
	{
	    f2=f0+f1;
	    System.out.print(f2+ " ");
	    f0=f1;
	    f1=f2;
	    n--;
	}
    }

}
