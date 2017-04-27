public class GMC extends car
{
	private int x = 0;
	private int y = 0;
	
	public GMC(int mx, int my)
	{
		x += mx;
		y += my;
	}
	
	public void move(int mx, int my)
	{
		x = mx;
		y = my;
	}
	
	public double[] getLoc()
	{
		double array[] = new double[2];
		return array;
	}
	
	
	
	
	
}