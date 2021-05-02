package com.vamsi.tricky;

import java.util.HashMap;
import java.util.Map;

public class TrickyMapDemo {

    public static void main(String[] args) {
	class Employee{
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
	
	System.out.println(mapTest.size());
	System.out.println(mapTest.get(e1));
	System.out.println(mapTest.get(e2));
    }

}
