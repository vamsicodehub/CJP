/**
 * 
 */
package com.vamsi.dp.Bridge;

/**
 * @author Lenovo
 *
 */
public class GreenCircle implements DrawAPI
{

    /*
     * (non-Javadoc)
     * 
     * @see com.vamsi.dp.Bridge.DrawAPI#drawCircle()
     */

    @Override
    public void drawCircle(int x, int y, int radius)
    {
	System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }

}
