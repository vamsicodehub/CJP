package com.vamsi.collection;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueDemo {

    public static void main(String[] args) {

	Queue<String> queue = new PriorityBlockingQueue<>();
	queue.add("Orange");
	queue.add("Apple");
	queue.add("Mango");
	queue.add("Apple");
	queue.add("vamsi");
	
	System.out.println(queue.peek()+" "+queue.peek()+" "+queue.peek()+" "+queue.peek());
	System.out.println(queue.poll()+" "+queue.poll()+" "+queue.poll()+" "+queue.poll());
    }

}
