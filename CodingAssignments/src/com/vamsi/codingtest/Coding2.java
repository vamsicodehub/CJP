package com.vamsi.codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//Finding the unique year of a date from a particular string

public class Coding2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String inputStr = "India got independance on 15-08-1947 and its republic year started from 26-01-1948 and the current year is 09-09-2019 and chutiya pakistan also got in 15-08-1947";
	System.out.println(returnResult(inputStr));
    }

    private static int returnResult(String inputStr) {

	List<String> dates = Arrays.stream(inputStr.split(" ")).filter(str -> Pattern.compile("^\\d{2}-\\d{2}-\\d{4}").matcher(str).matches()).collect(Collectors.toList());
	System.out.println(dates);

	Map<String,Integer> yearsMap = new HashMap<>();
	for(String date : dates) {
	   String year = date.substring(date.lastIndexOf("-")+1);
	   if(yearsMap.get(year) != null)
	       yearsMap.put(year, yearsMap.get(year)+1);
	   else
	       yearsMap.put(year, 1);
	}
	System.out.println(yearsMap);
	
	return (int) yearsMap.entrySet().stream().filter(entry -> entry.getValue() == 1).count();
    }

}
