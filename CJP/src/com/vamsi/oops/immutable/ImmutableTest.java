package com.vamsi.oops.immutable;

public class ImmutableTest {

    public static void main(String[] args) {
	
	Employee employee = new Employee();
	employee.setId(3103);
	employee.setName("vamsi");
	
	Department department = new Department(employee, "CMS");
	System.out.println("Before Modi :: "+department.getEmployee().getName());
	
	department.getEmployee().setName("Naga");
	
	System.out.println("After Modi :: "+department.getEmployee().getName());
	

    }

}
