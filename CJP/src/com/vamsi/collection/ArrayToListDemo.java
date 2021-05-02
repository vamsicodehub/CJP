package com.vamsi.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToListDemo
{

    public static void main(String[] args)
    {
	Object[] obj = new String[]{"Vamsi","Suppu","Sahana","Ketaki","Suppu"};
	
	System.out.println(obj.toString());
	
	Set<String> setList = new HashSet<>(Arrays.asList(Arrays.toString(obj)));
	
	Set<String> setList1 = new HashSet<>(Arrays.asList(Arrays.copyOf(obj, obj.length,String[].class)));
	System.out.println(Arrays.asList(obj));
	System.out.println(Arrays.asList(Arrays.toString(obj)));
	System.out.println(Arrays.asList(Arrays.copyOf(obj, obj.length,String[].class)));
//	System.out.println(setList);
	List<Object> arrToList = new ArrayList<>(Arrays.stream(obj).collect(Collectors.toList()));
	arrToList.add("Naga");
	
	System.out.println(">>>>>>>>>>"+Stream.of(obj).collect(Collectors.toList()));
	System.out.println(">>>>>>>>>>"+Stream.of(obj).collect(Collectors.toSet()));
	/*System.out.println(">>>>>>>>>>"+Stream.of(obj).collect(Collectors.toConcurrentMap(new Function<String, String>()
	{
	    @Override
	    public String apply(String t)
	    {
		// TODO Auto-generated method stub
		return null;
	    }
	}, new Function<String, String>()
	{
	    @Override
	    public String apply(String t)
	    {
		// TODO Auto-generated method stub
		return null;
	    }
	})));*/
//	List<Object> arrToList1 = new ArrayList<>(Stream.of(obj));
	
	System.out.println(arrToList);
	
	System.out.println(setList1);
	
	for(String s : setList1)
	{
	    System.out.println(s);
	}
	
	
	List<String> setToList = new ArrayList<>(setList);
	System.out.println(setToList);
	Object[] obj1 = setToList.toArray(new String[setToList.size()]);
	for(Object objArr : obj1) {
	    System.out.println(objArr);
	}
	System.out.println(setToList.toArray(new String[setToList.size()])[0]);
    }

}
