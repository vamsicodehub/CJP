package com.vam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("vamsi");
		list.add("sachin");
		for(String s:list)
		{
			if(s.equals("sachin"))
			{
				return;
			}
			System.out.println(s);
		}
	}

}
