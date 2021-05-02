package com.vamsi.hackerrank.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class BNPTest {

    public static void main(String[] args) {
	Thread t = new MyThread() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
        StringBuilder contents = new StringBuilder();
        contents.append(System.currentTimeMillis());
        contents.append(": ");
        contents.append(Thread.currentThread().getName());
        contents.append("Hi");
        contents.append("\n");
        
//        System.out.println(contents.toString());
        
        Map<WorkDay, String> m = new HashMap<WorkDay, String>();
        WorkDay t1 = new WorkDay("Monday");
        WorkDay t2 = new WorkDay("Monday");
        WorkDay t3 = new WorkDay("Tuesday");
        m.put(t1, "travel");
        m.put(t2, "play");
        m.put(t3, "work");
        System.out.println(m.size());
        
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("John");
        list.add("Mac");
        list.add("Kevin");

        Iterator<String> it = list.iterator();
        list.remove("Mac");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        CreditCard ccd1 = new CreditCard(1234);
        CreditCard ccd2 = new CreditCard(1234);

        List<CreditCard> cList = new ArrayList<CreditCard>();
        cList.add(ccd1);
        cList.add(ccd2);
        System.out.println("Location 1:" + cList.size());

        Set<CreditCard> cSet = new HashSet<CreditCard>();
        cSet.add(ccd1);
        cSet.add(ccd2);
        System.out.println("Location 2:" + cSet.size());
        
        Set<CreditCard> cSet2 = new HashSet<CreditCard>();
        cSet2.add(ccd1);
        cSet2.add(ccd1);
        System.out.println("Location 3:" + cSet2.size());
    }

}

class MyThread extends Thread {
    MyThread() {
        System.out.print(" MyThread");
    }

    public void run() {
        System.out.print(" bar");
    }

    public void run(String s) {
        System.out.print(" baz");
    }
}

class WorkDay {
    String day;

    WorkDay(String d) {
        day = d;
    }

    public boolean equals(Object o) {
        return ((WorkDay) o).day == this.day;
    }
}

class CreditCard {

    public int number;

    public CreditCard(int number) {
        this.number = number;
    }
}