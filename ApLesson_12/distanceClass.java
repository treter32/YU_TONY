import java.lang.Math.*;
public class distanceClass
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	
	public distanceClass()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public distanceClass(int x1, int x2, int y1, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	
	public void resetCoordinates()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public double getDistance()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}

}