package com.vamsi.java8.le;

public interface FI1
{
    int m1(int a,int b);
//    void m2();
    default void m2() {
	System.out.println("Welcome to default modifier impl in interface");
    }
}
