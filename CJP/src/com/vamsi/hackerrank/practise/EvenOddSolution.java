package com.vamsi.hackerrank.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class EvenOddSolution {

    public static void main(String[] args) {
	System.out.println(solve(2,new ArrayList<String>(Arrays.asList("ab","abcd"))));
    }

    public static String solve(int m, List<String> s) {
//	ExecutorService service = Executors.newFixedThreadPool(3);
	int[][] ordinalArr = new int[s.size()][];

	for (int i = 0; i < s.size(); i++) {
	    char[] c = s.get(i).toCharArray();
	    int[] rowArr = new int[c.length];
	    for (int j = 0; j < c.length; j++) {
		rowArr[j] = (int) c[j];
	    }
	    ordinalArr[i] = rowArr;
	}

	AtomicLong sum = new AtomicLong();
	for (int[] intArr : ordinalArr) {
	    for (int j = 0; j < intArr.length; j++) {
		sum = getSum(intArr[j], m, sum);
	    }

	}

	if (sum.longValue() % 2 == 0)
	    return "EVEN";
	else
	    return "ODD";

    }

    private static AtomicLong getSum(int value, int square, AtomicLong sum) {
	Long result = 1L;
	while (square != 0) {
	    result = result.longValue() * value;
	    --square;
	}
	return new AtomicLong(sum.longValue() + result);
    }

}
