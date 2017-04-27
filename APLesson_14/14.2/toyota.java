public class toyota extends car
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
	public double[] getLoc()
	{
		double array[] = new double[2];
		return array;
	}
}