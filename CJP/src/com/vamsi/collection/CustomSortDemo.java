package com.vamsi.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomSortDemo
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	int i =10;
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(1);
	list.add(20);
	list.add(5);
	customSort(list);

    }

    private static void customSort(List<Integer> list)
    {
	int temp = 0;
         for(int i = 0;i<list.size();i++) {
             for(int j=0;j<list.size();j++)
             {
        	 if(list.get(j) < list.get(i)) {
        	     temp = list.get(i);
        	     list.set(i, list.get(j));
        	     list.set(j, temp);
        	 }
             }
         }
         
         System.out.println(list);
    }

}
