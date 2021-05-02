package com.vamsi.dp.Command;

public class SellStock implements Order
{
    private Stock sellStock;

    public SellStock(Stock sellStock)
    {
	this.sellStock = sellStock;
    }

    @Override
    public void execute()
    {
	sellStock.sell();
    }

}
