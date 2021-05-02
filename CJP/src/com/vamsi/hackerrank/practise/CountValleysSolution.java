package com.vamsi.hackerrank.practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountValleysSolution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
	if (n % 2 == 1)
	    return 0;
	List<char[]> charArrList = substr(s, 4);
	int oddCount = 0;
	int evencount = 0;
	int internalCount = -1;
	for (char[] charArr : charArrList) {
	    Set<Character> charSet = new LinkedHashSet<>();
	    for (char c : charArr) {
		if ((c == 'U') && !charSet.add(c)) {
		    internalCount++;
		}
	    }
	    /*if (internalCount % 2 == 0) {
		evencount++;
	    }
	    else {
		oddCount++;
	    }*/
	}
//	return evencount / 2 + oddCount;
	return internalCount;
	

    }

    private static List<char[]> substr(String s, int partitionSize) {
	List<char[]> charArrList = new ArrayList<>();
	for (int i = 0; i < s.length() - 1; i += partitionSize) {
	    String subStr = s.substring(i, Math.min(i + partitionSize, s.length()));
	    charArrList.add(subStr.toCharArray());
	}

	return charArrList;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\Technical Stuff\\output1.txt"));

	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	String s = scanner.nextLine();

	int result = countingValleys(n, s);

	System.out.println(result);

	bufferedWriter.write(String.valueOf(result));
	bufferedWriter.newLine();

	bufferedWriter.close();

	scanner.close();
    }
}
