public class toyota implements location
{
	private double[] spot;
	private double x = 0;
	private double y = 0;
	
	public toyota(String a)
	{
		String[] spot = a.split(", ");
		x = Double.parseDouble(spot[0]);
		y = Double.parseDouble(spot[1]);
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
		double array[] = new double[2];
		array[0] = x;
		array[1] = y;
		return array;
	}
}