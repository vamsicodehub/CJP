package com.vamsi.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
	Map<Student, String> map = new LinkedHashMap<>();
//	HashMapDemo demo = new HashMapDemo();
	String str = new String("Topper");
	Student s = new Student(2, "vamsi");
	Student s2 = new Student(2, "vamsi");
	Student s1 = new Student(1, "Notgreat");
	System.out.println(map.put(s1, str));
	map.put(s, "dropper");
	map.put(s2, "dup");
//	s1 = null;
	System.out.println(map.size());
	System.out.println(map.get(s1));
	System.out.println(map.get(s));

    }
    
    static class Student{
	int rno;String name;
	public Student(int rno,String name) {
	    this.rno = rno;
	    this.name = name;
	}
	
	public int hashcode() {
	    return rno;
	}

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    result = prime * result + rno;
	    return result;
	}

	/*@Override
	public boolean equals(Object obj) {
	    if (this == obj)
		return true;
	    if (obj == null)
		return false;
	    if (getClass() != obj.getClass())
		return false;
	    Student other = (Student) obj;
	    if (name == null) {
		if (other.name != null)
		    return false;
	    }
	    else if (!name.equals(other.name))
		return false;
	    if (rno != other.rno)
		return false;
	    return true;
	}*/
	
	
    }

}
