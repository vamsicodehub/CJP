package com.vamsi.interview;

import java.util.Scanner;

public class ArraySort
{

    public static void main(String[] args)
    {
	int temp;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("ENter the elements size : ");
	
	int n = scan.nextInt();
	
	int e[] = new int[n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<n;i++)
	{
	    e[i] = scan.nextInt();
	}
	
	for(int i = 0;i<n;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
		if(e[i]<e[j])
		{
		 temp = e[i];
		 e[i] =e[j];
		 e[j]=temp;
		}
	    }
	}
	
	for(int i=0;i<n;i++)
	{
	    System.out.println(e[i]+" ");
	}
	
    }

}
