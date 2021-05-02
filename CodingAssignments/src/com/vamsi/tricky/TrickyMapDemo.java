package com.vamsi.tricky;

import java.util.HashMap;
import java.util.Map;

public class TrickyMapDemo {

    public static void main(String[] args) {
	final class Employee{
	    private int id;
	    private String name;

	    Employee(int id,String name){
		this.id = id;
		this.name = name;
	    }

	    @Override
	    public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
		return super.equals(obj);
	    }
	}
	
	Map<Employee,String> mapTest = new HashMap<>();
	Employee e1 = new Employee(10, "vamsi");
	Employee e2 = new Employee(10, "sachin");
	
	System.out.println(mapTest.put(e1, "vamsi"));
	System.out.println(mapTest.put(e2, "sachin"));
	
	System.out.println(mapTest.put(e1, "Kohli"));
	System.out.println(mapTest.put(e1, "Vamsi"));
	
	e1 = new Employee(12, "Yuvi");
	
	System.out.println(mapTest.size());
	System.out.println(mapTest.get(e1));
	System.out.println(mapTest.get(e2));
	
	Map<String,String> mapTest2 = new HashMap<>();
	String s1 = "vamsi";
	
	mapTest2.put(s1, s1);
	mapTest2.put("12", "12");
	
	System.out.println("Before Change :: "+mapTest2.get(s1));
	
	s1 = "vg";
	
	System.out.println("After Change :: "+mapTest2.get(s1));
	
    }

}
