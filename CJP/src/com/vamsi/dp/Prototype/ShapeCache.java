package com.vamsi.dp.Prototype;

import java.util.concurrent.ConcurrentHashMap;

public class ShapeCache
{
    private static ConcurrentHashMap<Integer, Shape> cacheMap = new ConcurrentHashMap<Integer, Shape>();

    public static Shape getShape(int id) throws CloneNotSupportedException
    {
	Shape cacheShape = cacheMap.get(id);
	return (Shape) cacheShape.clone();
    }

    public static void loadCache()
    {
	Rectangle rectangle = new Rectangle();
	rectangle.setId(1);
	cacheMap.put(rectangle.getId(), rectangle);
	
	Square square = new Square();
	square.setId(2);
	cacheMap.put(square.getId(), square);
	
	Circle circle = new Circle();
	circle.setId(3);
	cacheMap.put(3, circle);
	
    }
}
