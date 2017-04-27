public class honda extends car
{
	public double[] spot;
	private double x = 0;
	private double y = 0;
	public honda(double[] pos)
	{
		spot = pos;
		x = pos[0];
		y = pos[1];
	}	
	public double[] getLoc()
	{
		return spot;
	}
}