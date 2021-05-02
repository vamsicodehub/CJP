package com.vamsi.collection.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo
{
    String s;
    //PriorityBlockingQueueDemo a3 = new PriorityBlockingQueueDemo();
    
    public static void main(String[] args) throws InterruptedException
    {
	String[] names =
	{ "Vamsi", "Supriya", "Sahana", "Donepudi" };

	PriorityBlockingQueue<String> blockingQueue = new PriorityBlockingQueue<>();
	for (String name : names)
	{
	    blockingQueue.add(name);
	}
	PriorityBlockingQueueDemo a1 = new PriorityBlockingQueueDemo();
	PriorityBlockingQueueDemo a2 = new PriorityBlockingQueueDemo();//a1;
	a2.s = "Vamsi";
	
	System.out.println("a1.s >> "+a1.s);
	System.out.println("a2.s >> "+a2.s);
	
	System.out.println(blockingQueue);
	System.out.println(blockingQueue.poll()//+" "+blockingQueue.poll()//+" "+blockingQueue.poll())
	);
	System.out.println(blockingQueue);
	
	i i = new c();
    }

}

interface i
{
    public void m1();
}

class c implements i
{

    @Override
    public void m1()
    {
	System.out.println("m1");	
    }
    
    public void n1()
    {
	System.out.println("n1");
    }
    
}