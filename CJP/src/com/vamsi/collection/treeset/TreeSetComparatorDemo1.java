package com.vamsi.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo1
{

    public static void main(String[] args)
    {
	TreeSet<String> treeSet = new TreeSet<String>(new StrComparator());
	// treeSet.add(null);// null not allowed as a first element since java
	// 1.7
	treeSet.add("Vamsi");
	treeSet.add("Nagav");
	treeSet.add("Suppu");
	treeSet.add("Sahana");
	treeSet.add("X");

	System.out.println(treeSet);
    }

}

class StrComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2)
    {
	if (o1.length() > o2.length()) 
	{ 
	    return 1; 
	}
	else if (o1.length() < o2.length())
	{
	    return -1;
	}
	else
	{
	    return o1.compareTo(o2);
	}
    }

}
