package com.vamsi.dp.Bridge;

public class Circle extends Shape
{
    private int x,y,radius;

    public Circle(DrawAPI drawAPI,int x,int y, int radius)
    {
	super(drawAPI);
	this.radius=radius;
	this.x=x;
	this.y=y;
    }

    @Override
    public void draw()
    {
	drawAPI.drawCircle(x, y, radius);
    }

}
