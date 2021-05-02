package com.vamsi.mt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MTDemo1 {
    
    public static void main(String[] args) {
	System.out.println(Thread.currentThread().isAlive());
	
	Runnable r = () -> {
	    ReentrantLock reentrantLock = null;
	    try {
		System.out.println(Thread.currentThread().getName());
		reentrantLock = new ReentrantLock();
		if(reentrantLock.tryLock()) {
		    reentrantLock.lock();
		    System.out.println(Thread.currentThread().getName()+"COUNT ::"+reentrantLock.getHoldCount());
		    Thread.sleep(1000);
		}
	    }
	    catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }finally {
		reentrantLock.unlock();
		System.out.println(Thread.currentThread().getName()+"COUNT ::"+reentrantLock.getHoldCount());
	    }
	};
	
	System.out.println(r.toString());
	
	Runnable r1 = () -> {
	    ReentrantLock reentrantLock = null;
	    try {
		System.out.println(Thread.currentThread().getName());
		reentrantLock = new ReentrantLock();
		if(reentrantLock.tryLock()) {
		    reentrantLock.lock();
		    System.out.println(Thread.currentThread().getName()+"COUNT ::"+reentrantLock.getHoldCount());
		    Thread.sleep(100);
		}
		
	    }
	    catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }finally {
		reentrantLock.unlock();
	    }
	};
	
//	Thread t = new Thread(r);t.start();t.start();
//	new Thread(r).start();
	
	ExecutorService service = Executors.newFixedThreadPool(8);
	service.execute(r);
	service.execute(r);
	
	service.shutdown();
	
	System.out.println(r1.toString());
	
	System.out.println(Thread.currentThread().isAlive());
    }

}
