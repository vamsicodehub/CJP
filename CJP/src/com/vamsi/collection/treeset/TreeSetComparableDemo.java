package com.vamsi.collection.treeset;
import java.util.TreeSet;

public class TreeSetComparableDemo
{

    public static void main(String[] args)
    {
	TreeSet<Employee> treeSet = new TreeSet<Employee>();
	
	Employee emp = new Employee("Vamsi","Suppu");
	Employee emp1 = new Employee("Suppu", "Vamsi");
	
	treeSet.add(emp);
	treeSet.add(emp1);
	System.out.println(emp.compareTo(emp1));
	
	System.out.println(treeSet);
    }

}

class Employee implements Comparable<Employee>
{
    String firstName;
    String lastName;
    
    
    
    @Override
    public String toString()
    {
	return "["+firstName + "," + lastName + "]";
    }

    Employee(String firstName,String lastName)
    {
	this.firstName = firstName;
	this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    @Override
    public int hashCode()
    {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj)
    {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (firstName == null)
	{
	    if (other.firstName != null)
		return false;
	}
	else if (!firstName.equals(other.firstName))
	    return false;
	if (lastName == null)
	{
	    if (other.lastName != null)
		return false;
	}
	else if (!lastName.equals(other.lastName))
	    return false;
	return true;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Employee o)
    {
	return (this.firstName.compareTo(((Employee)o).firstName)- 
		this.lastName.compareTo(((Employee)o).lastName));
    }
    
}
