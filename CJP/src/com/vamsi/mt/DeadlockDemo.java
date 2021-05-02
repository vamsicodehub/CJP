package com.vamsi.mt;

public class DeadlockDemo
{

    String str1 = "Java";
    String str2 = "UNIX";

    Thread trd1 = new Thread("My Thread 1")
    {
	public void run()
	{
	    while (true)
	    {
		synchronized (str1)
		{
		    synchronized (str2)
		    {
			try
			{
			    str2.wait();
			}
			catch (InterruptedException e)
			{
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			System.out.println(str1 + str2);
		    }
		}
	    }
	}
    };

    Thread trd2 = new Thread("My Thread 2")
    {
	public void run()
	{
	    while (true)
	    {
		synchronized (str2)
		{
		    synchronized (str1)
		    {
			str1.notify();
			System.out.println(str2 + str1);
		    }
		}
	    }
	}
    };

    public static void main(String a[])
    {
	DeadlockDemo mdl = new DeadlockDemo();
	mdl.trd1.start();
	mdl.trd2.start();
    }
}
