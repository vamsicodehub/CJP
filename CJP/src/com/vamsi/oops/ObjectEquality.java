package com.vamsi.oops;

public class ObjectEquality {

    public static void main(String[] args) {
	Employee e = new Employee(10, "Tendulkar");
	Employee e1 = new Employee(10, "Tendulkar");
	Employee e2 = e1;
	
	System.out.println(e);
	System.out.println(e1);
	System.out.println(e == e1);
	System.out.println(e.equals(e1));
	System.out.println(e2 == e1);
	System.out.println(e2.equals(e1));
    }

}

class Employee {
    private int id;
    private String name;
    
    public Employee() {
    }
    
    public Employee(int id, String name) {
	this.id = id;
	this.name = name;
    }

    @Override
    public int hashCode() {
	int result = 1;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (id != other.id)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	}
	else if (!name.equals(other.name))
	    return false;
	return true;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}