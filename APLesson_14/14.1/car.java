public abstract class car implements location
{
	private double[] location;
	private int ID;
	
	public car()
	{
		ID = (int)(Math.random() * Math.pow(10,6))+1;
		location = new double[]{0, 0};
	}

	public int getID()
	{
		return ID;
	}
	
	public void move(int mx, int my)
	{
		location = new double[]{mx, my};
	}
	
	public double[] getLoc()
	{
		return location;
	}	
}


