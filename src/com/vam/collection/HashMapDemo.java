package com.vam.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Vamsi","The King");
		hm.put("Sachin","The Batsman");
		for(Map.Entry<String, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
		Set<String> set = hm.keySet();
		System.out.println("Set are : " +set);
		
		Collection<String> col = hm.keySet();
		Iterator<String> itr = col.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Col are : "+col);
		
		Collection<String> values = hm.values();
		System.out.println("Values are : " +values);
	}

}
