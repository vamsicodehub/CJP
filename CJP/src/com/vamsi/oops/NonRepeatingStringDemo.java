package com.vamsi.oops;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatingStringDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	String str = "vamsimessi";
	Set<Character> charSet = new HashSet<>();
	Map<Character,Integer> nonRepCharMap = new LinkedHashMap<>();
	for(char c : str.toCharArray()) {
	    System.out.println(nonRepCharMap.put(c, 1));
	    if(!charSet.add(c))
		nonRepCharMap.remove(c);
	}
	System.out.println(nonRepCharMap);

    }

}
