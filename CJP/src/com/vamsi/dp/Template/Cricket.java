package com.vamsi.dp.Template;

public class Cricket extends Game
{

    @Override
    public void initialize()
    {
	System.out.println("Cricket game initialized");
    }

    @Override
    public void gameStart()
    {
	System.out.println("Cricket game started");
    }

    @Override
    public void gameEnd()
    {
	System.out.println("Cricket game ended");
    }

}
