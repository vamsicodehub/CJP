package com.vamsi.dp.Strategy;

public class StraegyPatternDemo
{

    public static void main(String[] args)
    {
	Context context = new Context(new AddOperationStrategy());
	System.out.println(context.executeStrategy(1000, 190));
	
	context = new Context(new SubOperationStrategy());
	System.out.println(context.executeStrategy(1000, 190));
	
	context = new Context(new MulOperationStrategy());
	System.out.println(context.executeStrategy(1000, 190));
	
	context = new Context(new DivOperationStrategy());
	System.out.println(context.executeStrategy(1000, 190));
    }

}
