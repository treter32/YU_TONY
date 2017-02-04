import java.lang.Math.*;
public class milesPerHourClass
{
	private int distance, hour, minute;
	private double mph;
	
	public milesPerHourClass()
	{
		distance = 0;
		hour = 0;
		minute = 0;
		mph = 0;
	}
	
	public milesPerHourClass(int d, int h, int m)
	{
		distance = d;
		hour = h;
		minute = m;
		mph = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hour = h;
		minute = m;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hour + minute / 60.0));
		return mph;
	}	

	
	

	
}
	