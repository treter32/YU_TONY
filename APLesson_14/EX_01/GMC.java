public class GMC implements location
{
	private int x = 0;
	private int y = 0;
	
	public GMC(int mx, int my)
	{
		x += mx;
		y += my;
	}
	
	public int getID()
	{
		int id = (int)(Math.random() * Math.pow(10,6))+1;
		return id;
	}
	
	public void move(int mx, int my)
	{
		x = mx;
		y = my;
	}
	
	public double[] getLoc()
	{
		double array[] = new double[2];
		array[0] = x;
		array[1] = y;
		return array;
	}
	
	
	
}