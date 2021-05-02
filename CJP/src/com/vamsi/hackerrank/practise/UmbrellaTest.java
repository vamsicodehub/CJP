package com.vamsi.hackerrank.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UmbrellaTest {

    public static void main(String[] args) {
	System.out.println(getUmbrellas(4, new ArrayList<Integer>(Arrays.asList(2, 2, 4, 4))));
    }

    public static int getUmbrellas(int n, List<Integer> p) {
	Integer[] arr = p.toArray(new Integer[0]);
	if (arr == null || arr.length == 0 || n < 1)
	    return -1;
	int i = arr.length - 1;
	Arrays.sort(arr);
	int count = 0;
	while (n >= 0 && i >= 0) {
	    count += n / arr[i];
	    n = n % arr[i];
	    i--;
	}
	return n != 0 ? -1 : count;
    }

}
