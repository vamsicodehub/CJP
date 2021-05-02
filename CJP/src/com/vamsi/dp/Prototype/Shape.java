package com.vamsi.dp.Prototype;

public abstract class Shape implements Cloneable
{
    private int id;
    private String type;
    
    abstract void draw();
    
    public Object clone() throws CloneNotSupportedException
    {
	return super.clone();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

}
