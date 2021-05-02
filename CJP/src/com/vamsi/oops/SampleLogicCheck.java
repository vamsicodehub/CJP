package com.vamsi.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SampleLogicCheck {

    public static void main(String[] args) {
	List<String> checkList = new ArrayList<>();
//	checkList.add("SELLER_FINANCE");
	checkList.add("BUYER_FINANCE");
	checkList.add("EIPP");
	System.out.println(getCustomerType7(checkList));
    }

    private static List<String> getCustomerType(List<String> checkList) {
	List<String> returnCheckList = new ArrayList<>();
	if(!checkList.isEmpty()) {
	    returnCheckList = checkList.stream().map(f -> (checkList.contains("SELLER_FINANCE")&&checkList.contains("BUYER_FINANCE") ? "BOTH" : (f.equals("SELLER_FINANCE") || f.equals("EIPP")) ? f.replace(f, "SF"):f.equals("BUYER_FINANCE") ? "BF":"")).collect(Collectors.toList());
	}
	return returnCheckList;
    }
    
    private static Set<String> getCustomerType7(List<String> checkList) {
	Set<String> returnCheckList = new HashSet<>();
	boolean isContainsBoth = false;
	for(String cust : checkList) {
	    if(!isContainsBoth && checkList.contains("SELLER_FINANCE") && checkList.contains("BUYER_FINANCE")) {
		isContainsBoth = true;
		returnCheckList.add("BOTH");
	    }
	    if(!isContainsBoth && (cust.equals("SELLER_FINANCE") || cust.equals("EIPP")))
		returnCheckList.add("SF");
	    if(!isContainsBoth && cust.equals("BUYER_FINANCE"))
		returnCheckList.add("BF");
	}
	return returnCheckList;
    }


}
