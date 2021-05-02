package com.vamsi.serialization;

import java.io.Serializable;

public class Employee implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -6090723719874255690L;
    /**
     * 
     */
    private String empName;
    private int empNo;
    private String designation;

    @Override
    public String toString()
    {
	return "Employee [empName=" + empName + ", empNo=" + empNo + ", designation=" + designation + "]";
    }

    public Employee(String empName, int empNo)
    {
	super();
	this.empName = empName;
	this.empNo = empNo;
    }

    public Employee(String empName, int empNo, String designation)
    {
	super();
	this.empName = empName;
	this.empNo = empNo;
	this.designation = designation;
    }

    public String getEmpName()
    {
	return empName;
    }

    public void setEmpName(String empName)
    {
	this.empName = empName;
    }

    public int getEmpNo()
    {
	return empNo;
    }

    public void setEmpNo(int empNo)
    {
	this.empNo = empNo;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

}
