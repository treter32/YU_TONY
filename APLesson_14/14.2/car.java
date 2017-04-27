public class car implements location
{
	public int x = 0;
	public int y = 0;
	public int getID()
	{
		int id = (int)(Math.random() * Math.pow(10,6))+1;
		return id;
	}
	public double[] getLoc()
	{
		return new double[] {x,y};
	}
	public void move(int mx, int my)
	{
		x += mx;
		y += my;
	}
}