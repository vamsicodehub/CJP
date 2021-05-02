package com.vamsi.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo
{

    public static void main(String[] args)
    {
	TreeSet<String> treeSet = new TreeSet<String>();
	//treeSet.add(null);// null not allowed as a first element since java 1.7
	treeSet.add("Vamsi");
	treeSet.add("Suppu");
	
	System.out.println(treeSet);
	
	//If we are adding objects to treeset compulsory objects should be comparable and homogenous if we are depending on default sorting order
	/*
	TreeSet<StringBuffer> treeSet1 = new TreeSet<>();
	treeSet1.add(new StringBuffer("Vamsi"));
	treeSet1.add(new StringBuffer("Suppu"));
	
	System.out.println(treeSet1);*/
    }

}

