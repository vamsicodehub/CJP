package com.vamsi.dp.Bridge;

public class BridgeDPDemo
{

    public static void main(String[] args)
    {
	Circle circle = new Circle(new RedCircle(), 10, 10, 100);
	circle.draw();

	circle = new Circle(new GreenCircle(), 20, 20, 200);
	circle.draw();
    }

}
