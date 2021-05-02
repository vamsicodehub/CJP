package com.vamsi.puzzles;

import java.util.HashSet;

public class My5Puzzle {

	public static void main(String[] args) {
		        HashSet<Short> s = new HashSet<Short>();//1
		        for(Short i = 0; i<100;i++){//2
		            s.add(i);//3
		            //Short j = (short) (i-1);
		            s.remove((short) (i-1));//4
		        }
		        System.out.println(s.size());//5
		    }

}
