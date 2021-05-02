package com.vamsi.dp.Strategy;

public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
	this.strategy = strategy;
    }
    
    public double executeStrategy(double x,double y)
    {
	return strategy.doOperation(x, y);
    }
} 
