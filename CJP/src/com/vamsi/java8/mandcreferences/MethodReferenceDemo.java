package com.vamsi.java8.mandcreferences;

import java.util.function.Consumer;

public class MethodReferenceDemo
{

    public static void main(String[] args)
    {
	Thread t = new Thread(() -> System.out.println("Yahoooooo.... ! My first Lambda code"));
	Thread t1 = new Thread(MethodReferenceDemo :: printLambda);
	t.start();
	t1.start();
//	printLambda1(p ->  System.out.println("Yahoooooo.... ! My first Lambda code"+p));
    }
    
    private static void printLambda1(Consumer<String> consume)
    {
	consume.accept("vam");
    }
    
    private static void printLambda(){
	System.out.println(Thread.currentThread().getName());
	Consumer<String> consumer = p -> System.out.println("Yahoooooo.... ! My first Lambda code "+p);
	consumer.accept("Vamsi");
    }
}
