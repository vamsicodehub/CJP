package com.vamsi.dp.Strategy;

public class SubOperationStrategy implements Strategy
{

    @Override
    public double doOperation(double x, double y)
    {
	return x-y;
    }

}
