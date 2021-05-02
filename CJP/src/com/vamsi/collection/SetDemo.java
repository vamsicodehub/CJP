package com.vamsi.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) 
	{
		String name="Naga";
		Employee employee = new Employee(name, "Vamsi");
		Employee employee1 = new Employee(name, "Vamsi");
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		System.out.println(employeeSet.add(employee));
		System.out.println(employeeSet.add(employee1));
		
		System.out.println(employeeSet);
		System.out.println(employeeSet.size());
		employeeSet.remove(employee);
		System.out.println(employeeSet.size());

	}

}

class Employee
{
	private String firstName;
	private String lastName;
	
	public Employee() 
	{
	}
	
	Employee(String firstName,String lastName)
	{
		this.firstName= firstName;
		this.lastName=lastName;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		System.out.println(firstName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	    return 1;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
//		return super.toString();
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
