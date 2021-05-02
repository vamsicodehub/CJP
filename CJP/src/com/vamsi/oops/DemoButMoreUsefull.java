package com.vamsi.oops;

import java.util.Arrays;
import java.util.function.Predicate;

public class DemoButMoreUsefull {

    public static void main(String[] args) {
	String arr[] = new String[10];
	for(int i = 0;i<arr.length;i++){
		int j = i;
		arr[i] = ++j + "";
	}
	Predicate<String> predicate = str -> (Integer.valueOf(str) & 1) != 0;
	Arrays.stream(arr).filter(predicate).forEach(str -> System.out.print(str+" "));

    }
    
    private static void isOdd(String str1) {
	Predicate<String> predicate = str -> {
	    if(str==null || str.isEmpty())
		return false;
	    return ((Integer.valueOf(str) & 1) != 0) ;
	};
}

}
