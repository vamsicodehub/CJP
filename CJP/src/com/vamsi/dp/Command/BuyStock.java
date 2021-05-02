package com.vamsi.dp.Command;

public class BuyStock implements Order
{
    private Stock buyStock;
    
    public BuyStock(Stock buyStock)
    {
	this.buyStock = buyStock;
    }

    @Override
    public void execute()
    {
	buyStock.buy();
    }

}
