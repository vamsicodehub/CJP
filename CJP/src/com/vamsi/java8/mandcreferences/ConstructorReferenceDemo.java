package com.vamsi.java8.mandcreferences;

public class ConstructorReferenceDemo
{

    public static void main(String[] args)
    {
	constRef constRef = String::new;
	System.out.println(constRef.hi().length());
    }

}

interface constRef{
    String hi();
}
