package com.vamsi.eh;

import java.io.IOException;

public class EHDemo1 {

    public static void main(String[] args) throws Exception {
	System.out.println(ehreturnCheck());
    }

    private static Integer ehreturnCheck() throws Exception {
	try {
	    throw new ArithmeticException("Art");
	}catch(Exception e) {
	    throw new IOException("IO");
	}finally {
//	    throw new Exception("Ex");
	    return 1;
	}
    }
}
