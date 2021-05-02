package com.vamsi.hackerrank.practise;

import java.util.Arrays;
import java.util.List;

public class BalancedArraySolution {

    public static void main(String[] args) {
	Integer[] arr = { 4,1,2,3,3}; 
        System.out.println(equilibrium(Arrays.asList(arr))); 
    }
    
    static int equilibrium(List<Integer> sales) 
    { 
	int leftsum = 0;
        int rightsum = 0; 

        Integer[] salesArr = sales.toArray(new Integer[0]);
        int length = sales.size();
  
        for (int i = 0; i < length; ++i) { 
            leftsum = 0;   
            for (int j = 0; j < i; j++) 
                leftsum += salesArr[j]; 
  
            rightsum = 0; 
            for (int j = i + 1; j < length; j++) 
                rightsum += salesArr[j]; 
  
            if (leftsum == rightsum) 
                return i; 
        } 
  
        return -1; 
  } 

}
