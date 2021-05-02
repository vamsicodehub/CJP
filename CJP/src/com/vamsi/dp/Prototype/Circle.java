package com.vamsi.dp.Prototype;

public class Circle extends Shape
{
    public Circle()
    {
	setType("Circle");
    }

    @Override
    void draw()
    {
	System.out.println("Circle Drawn");
    }

}
