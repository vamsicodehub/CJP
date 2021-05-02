package com.vamsi.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {

		Employee1 employee = new Employee1(10, 20);
		Employee1 employee1 = new Employee1(10, 20);
		
		Set<Employee1> employeeSet = new HashSet<Employee1>();
		System.out.println(employeeSet.add(employee));
		System.out.println(employeeSet.add(employee1));
		
		System.out.println(employeeSet);
	}

}

class Employee1
{
	private Integer firstName;
	private Integer lastName;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		Employee1 other = (Employee1) obj;
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

	public Employee1() 
	{
	}
	
	Employee1(int firstName,int lastName)
	{
		this.firstName= firstName;
		this.lastName=lastName;
	}
}
