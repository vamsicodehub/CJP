package com.vamsi.dp.Prototype;

public class Rectangle extends Shape
{
    Rectangle()
    {
	setType("Rectangle");
    }

    @Override
    void draw()
    {
	System.out.println("Rectangle drawn");
    }

}
