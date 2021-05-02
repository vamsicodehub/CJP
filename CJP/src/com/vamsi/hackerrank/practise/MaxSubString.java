package com.vamsi.hackerrank.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxSubString {
    public static void main(String args[]) {
	String str = "ba";
	System.out.println("All substring of abbc are:");

	String subStrList = maxSubstring(str);

	System.out.println(subStrList);
    }

    public static String maxSubstring(String s) {
	List<String> subStrList = getSubStrList(s);
	Collections.sort(subStrList, new Comparator<String>() {
	    public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	    }
	});

	return subStrList.get(0);

    }

    private static List<String> getSubStrList(String str) {
	List<String> subStrList = new ArrayList<>();
	for (int i = 0; i < str.length(); i++) {
	    for (int j = i + 1; j <= str.length(); j++) {
		subStrList.add(str.substring(i, j));
	    }
	}
	return subStrList;
    }

}
