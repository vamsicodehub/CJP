package com.vamsi.hackerrank.practise;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonUtilsSortSolution {

    public static void main(String[] args) {
	
    }

    public static void sortPersons(List<Person> persons, String[] sortBy) {
	Collections.sort(persons, new Comparator<Person>() {
	    @Override
	    public int compare(Person o1, Person o2) {
		String methodName = "";
		int result = 0;
		for (String str : sortBy) {
		    try {
			methodName = "get" + str.substring(0, 1).toUpperCase() + str.substring(1);
			for(Method method : o1.getClass().getDeclaredMethods()) {
			    if(method.getName().equalsIgnoreCase(methodName)) {
				methodName = method.getName();
				break;
			    }
			}
			result = o1.getClass().getMethod(methodName).invoke(o1).toString().
				compareTo(o2.getClass().getMethod(methodName).invoke(o2).toString());
			if(result != 0) {
			    return result;
			}
		    }
		    catch (Exception e) {
		    }
		}

		return result;
	    }
	});
    }

}

class Person {
    String firstName;
    String lastName;
    int age;
    String country;

    public Person(String firstName, String lastName, int age, String country) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.country = country;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public int getAge() {
	return age;
    }

    public String getCountry() {
	return country;
    }

    @Override
    public String toString() {
	return firstName + "|" + lastName + "|" + age + "|" + country;
    }
}
