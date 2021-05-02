package com.vamsi.dp.Template;

public abstract class Game
{
    public abstract void initialize();

    public abstract void gameStart();

    public abstract void gameEnd();

    public void play()
    {
	initialize();
	gameStart();
	gameEnd();
    }
}
