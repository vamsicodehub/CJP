package com.vamsi.hackerrank.practise;

public class NextPermutedString {

    public static void main(String[] args) {
	String word = "xy";
	char[] data = word.toCharArray();
	if (!nextPermutedWord(data))
	    System.out.println("no answer");

	System.out.println(new String(data));
    }

    public static boolean nextPermutedWord(char[] data) {

	if (data.length <= 1)
	    return false;

	int last = data.length - 2;

	while (last >= 0) {
	    if (data[last] < data[last + 1]) {
		break;
	    }
	    last--;
	}

	if (last < 0)
	    return false;

	int nextGreater = data.length - 1;

	for (int i = data.length - 1; i > last; i--) {
	    if (data[i] > data[last]) {
		nextGreater = i;
		break;
	    }
	}

	data = swap(data, nextGreater, last);

	data = reverse(data, last + 1, data.length - 1);

	return true;

    }

    public static char[] swap(char[] data, int left, int right) {

	char temp = data[left];
	data[left] = data[right];
	data[right] = temp;

	return data;
    }

    public static char[] reverse(char[] data, int left, int right) {
	while (left < right) {
	    char temp = data[left];
	    data[left++] = data[right];
	    data[right--] = temp;
	}

	return data;
    }

    public static String rearrangeWord(String word) {

	char[] data = word.toCharArray();

	if (!nextPermutedWord(data))
	    return "no answer";

	return new String(data);

    }

}
