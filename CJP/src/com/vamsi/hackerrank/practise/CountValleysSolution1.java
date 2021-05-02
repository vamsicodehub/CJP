package com.vamsi.hackerrank.practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountValleysSolution1 {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
	if (n % 2 == 1)
	    return 0;
	int level = 0;
	int count = 0;
	for(char c : s.toCharArray()) {
	    if(c=='U')
		level++;
	    if(c=='D')
		level--;
	    if(level==0 && c == 'U')
		count++;
	}
	return count;

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
