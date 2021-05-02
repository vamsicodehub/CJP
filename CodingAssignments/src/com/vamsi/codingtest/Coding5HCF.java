package com.vamsi.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding5HCF {

    public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String numStr1 = br.readLine();
	String numStr2 = br.readLine();

	int numb1 = Integer.parseInt(numStr1);
	int numb2 = Integer.parseInt(numStr2);

	System.out.println("Result is :: " + findHCF(numb1, numb2));
    }

    private static int findHCF(int numb1, int numb2) {

	int hcf = ((numb1 > numb2) ? numb2 : numb1) ;

	while (numb1 != 0) {
	    try {
		if (numb1 % --hcf == 0 && numb2 % hcf == 0) {
		    break;
		}
	    }
	    catch (ArithmeticException e) {
		return -1;
	    }
	}

	return hcf;
    }

}
