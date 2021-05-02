package com.vamsi.genericoll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExtendsDemo
{

	public static void main(String[] args)
	{
		List<? extends Number> list = new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		//list.add(li);
		addCol(list);
	}
	
	static void addCol(List<? extends Number> add)
	{
		List<? extends Number> addList = new ArrayList<Number>();
		//addList.addAll((Collection<? extends Number>) add);
	}

}
