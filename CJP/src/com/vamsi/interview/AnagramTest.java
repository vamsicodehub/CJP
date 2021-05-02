package com.vamsi.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class AnagramTest {
    
    public static void main(String[] args) {
	List<String> anList = new ArrayList<>();    
	    
	anList.add("4");
	anList.add("poke");
	anList.add("pkoe");
	anList.add("okpe");
	anList.add("ekop");
	
	System.out.println(funWithAnagrams(anList));
	
    }

    

    public static List<String> funWithAnagrams(List<String> s) {
    
    if(s == null || s.isEmpty())
        return new ArrayList<>();
    List<String> anagramList = new ArrayList<>();
    List<String> currentList = null;
    
    for(int i=0;i<s.size();i++){
        currentList = new ArrayList<>();
        for(int j = i+1; j<s.size();j++){
        if(isAnagram(s.get(i),s.get(j))){
            currentList.add(s.get(i));
            currentList.add(s.get(j));
            Collections.sort(currentList);
            currentList.remove(1);

            anagramList.addAll(currentList);
        }
        }
    }
    return anagramList;
    }

    static boolean isAnagram(String s1,String s2){
        if(s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();Arrays.sort(c1);
            char[] c2 = s2.toCharArray();Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
        return false;
    }

}


