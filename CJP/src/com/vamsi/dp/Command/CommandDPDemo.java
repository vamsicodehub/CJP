package com.vamsi.dp.Command;

public class CommandDPDemo
{

    public static void main(String[] args)
    {
	Stock bsStock = new Stock();
	bsStock.setName("DIVIS");
	bsStock.setQuantity(200);

	BuyStock buyStock = new BuyStock(bsStock);
	SellStock sellStock = new SellStock(bsStock);

	buyStock.execute();
	sellStock.execute();
    }

}
