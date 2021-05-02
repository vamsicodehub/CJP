package com.vamsi.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo
{

    public static void main(String[] args)
    {

	TreeSet<Employee> treeSet = new TreeSet<Employee>(new EmpComparator());
	
	Employee emp = new Employee("Vamsi","Suppu");
	Employee emp1 = new Employee("Suppu", "Vamsi");
	
	treeSet.add(emp);
	treeSet.add(emp1);
	System.out.println(emp.compareTo(emp1));
	
	System.out.println(treeSet);
    
    }

}

class EmpComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2)
    {
	return (o1.firstName.compareTo(((Employee)o2).firstName)- 
		o1.lastName.compareTo(((Employee)o2).lastName));    }
    
}