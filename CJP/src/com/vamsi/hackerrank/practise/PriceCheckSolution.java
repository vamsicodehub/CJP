package com.vamsi.hackerrank.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PriceCheckSolution {

    public static void main(String[] args) {
	System.out.println(priceCheck(new ArrayList<String>(Arrays.asList("rice", "wheat", "bread", "banana")), new ArrayList<Float>(Arrays.asList(50.60F, 45.79F, 20F, 35F)),
		new ArrayList<String>(Arrays.asList("wheat","rice","banana")), new ArrayList<Float>(Arrays.asList(45.79F, 50.60F,23F))));
    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
	int result = 0;
	Map<String,Float> ppmap = new LinkedHashMap<String, Float>();
	for(int i=0;i<products.size();i++) {
	    ppmap.put(products.get(i), productPrices.get(i));
	}
	Map<String,Float> spmap = new LinkedHashMap<String, Float>();
	for(int i=0;i<productSold.size();i++) {
	    spmap.put(productSold.get(i), soldPrice.get(i));
	}
	for(String productss : productSold) {
	    if(ppmap.get(productss) != null) {
		if(!ppmap.get(productss).equals(spmap.get(productss)))
			result++;
	    }
	}
	return result;
    }
}
