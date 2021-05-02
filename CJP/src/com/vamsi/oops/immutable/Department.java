package com.vamsi.oops.immutable;

import java.util.HashMap;

public class Department {

    private Employee employee;
    private String deptName;
    
    public Department(Employee employee,String deptName) {
	this.employee = employee;
	this.deptName = deptName;
    }

    public Employee getEmployee() {
	Employee emp = null;
	try {
	    emp = (Employee) employee.clone();
	}
	catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
	
	return emp;
    }

    public String getDeptName() {
	return deptName;
    }

}
