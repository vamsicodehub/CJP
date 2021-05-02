package com.vamsi.oops;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberDemo
{

    public static void main(String[] args)
    {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the total nums");
	int num = scanner.nextInt();
	System.out.println("Please enter the numb list");
	int[] numList = new int[num];
	for(int i =0;i<num;i++)
	{
	    numList[i]=scanner.nextInt();
	}
	//checkMissingNum(num,numList);
	findMissingNumber(numList,num);
	
    }

    private static void findMissingNumber(int[] numList, int num)
    {
	int i;
	Arrays.sort(numList);
	System.out.println(numList[0]);
	System.out.println(numList[num-1]);
	System.out.println(System.currentTimeMillis());
	    int x1 = numList[1]; /* For xor of all the elements in array */
	    int x2 = 1; /* For xor of all the elements from 1 to n+1 */
	     
	    for (i = 1; i< num; i++)
	        x1 = x1^numList[i];
	            
	    for ( i = 2; i <= num+1; i++)
	        x2 = x2^i;         
	    System.out.println(System.currentTimeMillis());
	    System.out.println("Missing Numb is :: "+(x1^x2));
    }

    private static void checkMissingNum(int num, int[] numList)
    {
	Arrays.sort(numList);
	int index = -1;
	int sum = 0;
	for(int i=0;i<num;i++)
	{
	    System.out.println(numList[i]);
	    if(numList[i]==0)
	    {
		index=i;
	    }
	    else
	    {
		sum = sum+numList[i];
	    }
	}
	
	int total = num*(num+1)/2;
	
	System.out.println("Missing number is: " + (total - sum) + " at index " + index);
	
    }  

}
