package com.vam.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{

	public static void main(String[] args)
	{
		Set<StringBuffer> ts = new TreeSet<>(new MyComp());
		ts.add(new StringBuffer("Vmasi"));
		ts.add(new StringBuffer("Sachin"));
		System.out.println(ts);
	}

}
class MyComp implements Comparator<StringBuffer>
{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2)
	{
		return 0;
	}

}
