package com.vamsi.oops;

public class PolyDemo
{

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.m1();
		Parent[][] parr = new Parent[90][];
		System.out.println(parr);
		Parent p1 = new Child();
		p1.m1();
		
		((Child)p1).m2();
		Child c = (Child)p1;
		//c.m2();
		
		Child c1 = (Child) new Child();
		c1.m1();

	}

}

class Parent
{
	void m1()
	{
		System.out.println("Am a Parent's Method");
	}
}
class Child extends Parent
{
	void m1()
	{
		//super.m1();
		System.out.println("Am a Child's Method");
	}
	void m2()
	{
		System.out.println("I belongs to Child only");
	}
}
