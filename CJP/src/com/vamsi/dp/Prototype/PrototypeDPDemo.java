package com.vamsi.dp.Prototype;

public class PrototypeDPDemo
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
	ShapeCache.loadCache();
	
	System.out.println("Shape is " + ShapeCache.getShape(1).getType());
	System.out.println("Shape is "+ShapeCache.getShape(2).getType());
	System.out.println("Shape is "+ShapeCache.getShape(3).getType());
    }

}
