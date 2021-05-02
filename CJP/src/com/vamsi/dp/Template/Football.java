package com.vamsi.dp.Template;

public class Football extends Game
{

    @Override
    public void initialize()
    {
	System.out.println("Football game initialized");
    }

    @Override
    public void gameStart()
    {
	System.out.println("Football game started");
    }

    @Override
    public void gameEnd()
    {
	System.out.println("Football game ended");
    }

}
