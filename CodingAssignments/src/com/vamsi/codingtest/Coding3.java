package com.vamsi.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coding3 {

    public static void main(String[] args) throws IOException {

	// BufferedReader
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number....");
	int startRange = Integer.parseInt(br.readLine()); // Reading input from
							  // STDIN
	System.out.println("Hi, " + startRange + "."); // Writing output to
						       // STDOUT

	// Scanner
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the EndRange....");
	String endRange = s.nextLine(); // Reading input from
	System.out.println("Hi, " + endRange + "."); // Writing output to STDOUT
	String[] endRangeArr = endRange.split(" ");
	for (int i = 0; i < endRangeArr.length; i++) {
	    printOutput(Integer.parseInt(endRangeArr[i]));
	}
    }

    static void printOutput(int endRange) {
	System.out.println(endRange);
	List<String> outputList = new ArrayList<>();
	for (int i = 1; i <= endRange; i++) {
	    String localStr = i + "";
	    if (i % 3 == 0) {
		localStr = "Fizz";
	    }
	    if (i % 5 == 0) {
		localStr = "Buzz";
	    }
	    if (i % 3 == 0 && i % 5 == 0) {
		localStr = "FizzBuzz";
	    }

	    outputList.add(localStr);
	}

	outputList.stream().forEach(System.out::println);
    }

}
