package com.vamsi.codingtest;

import java.util.Arrays;

// Arrays shifting based on tab value

public class Coding1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int input[] = new int[] { 1, 2, 3, 5, 6, 8, 9 };
	int shiftPos = 6;

	System.out.println(Arrays.toString(returnResultLogic1(input.length, shiftPos, input)));
	System.out.println(Arrays.toString(returnResultLogic2(input.length, shiftPos, input)));

    }

    private static int[] returnResultLogic1(int length, int shiftPos, int[] input) {
	System.out.println("Input before shifting :: " + Arrays.toString(input));
	if (shiftPos > input.length)
	    return input;

	int[] output = new int[input.length];
	output[0] = input[shiftPos - 1];
	for (int i = 0; i < input.length; i++) {
	    int j = i;
	    if (i <= shiftPos - 1)
		j = i + 1;

	    if (!(shiftPos - 1 == i && i == input.length - 1)) {
		output[j] = input[i];
	    }

	}
	System.out.println("Output after shifting input :: " + Arrays.toString(output));
	return output;
    }

    private static int[] returnResultLogic2(int length, int shiftPos, int[] input) {
	System.out.println("Input before shifting :: " + Arrays.toString(input));
	if (shiftPos > input.length)
	    return input;

	int temp = input[shiftPos - 1];
	for (int i = shiftPos - 1; i > 0; i--) {
	    int j = i - 1;
	    input[i] = input[j];
	}
	input[0] = temp;
	System.out.println("Output after shifting input :: " + Arrays.toString(input));
	return input;
    }
    
}
