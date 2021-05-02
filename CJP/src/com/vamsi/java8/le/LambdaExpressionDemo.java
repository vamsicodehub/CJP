package com.vamsi.java8.le;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExpressionDemo
{

    public static void main(String[] args)
    {
//	FI1 fi1 = ()-> System.out.println("Welcome to Lamda Expression world......"); 
//		same way we can implement LE with arg type methods by simply passing params m1(a,b)
//	(a,b) -> a+b)
	FI1 fi1 = (a,b) -> a+b;
		System.out.println(fi1.m1(10,20));
		fi1.m2();
		
	List<String> myList = new ArrayList<>();
	for(int i = 1;i<=10;i++) {
	    myList.add(i+"");
	}
	
	Map<String,Long> map = myList.stream().collect(Collectors.toMap(x->x.toString(), x->x));
	
    }

}
