package com.vamsi.dp.Strategy;

public class DivOperationStrategy implements Strategy
{

    @Override
    public double doOperation(double x, double y)
    {
	return x/y;
    }

}
