package com.vamsi.dp.Prototype;

public class Square extends Shape
{
    public Square()
    {
	setType("Square");
    }

    @Override
    void draw()
    {
	System.out.println("Square Drawn");
    }

}
