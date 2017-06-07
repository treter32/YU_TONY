public class honda implements location
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
	public int getID()
	{
		int id = (int)(Math.random() * Math.pow(10,6))+1;
		return id;
	}
	
	public void move(int mx, int my)
	{
		spot[0] += mx;
		spot[1] += my;
	}
	
	public double[] getLoc()
	{
		return spot;
	}
}