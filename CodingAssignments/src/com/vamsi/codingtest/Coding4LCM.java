package com.vamsi.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding4LCM {

    public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String numStr1 = br.readLine();
	String numStr2 = br.readLine();
	
	int numb1 = Integer.parseInt(numStr1);
	int numb2 = Integer.parseInt(numStr2);
	
	System.out.println("Result is :: "+findLCM(numb1,numb2));
    }

    private static int findLCM(int numb1, int numb2) {
	int lcm = 0,step = 0;
	lcm = step = (numb1 > numb2) ? numb1 : numb2;
	while(numb1 != 0) {
	    if(lcm % numb1 == 0 && lcm % numb2 == 0)
		break;
	    
	    lcm += step;
	}
	
	return lcm;
    }

}
