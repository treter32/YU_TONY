public abstract class car implements location
{

	public int getID()
	{
		int id = (int)(Math.random() * Math.pow(10,6))+1;
		return id;
	}
	public abstract double[] getLoc();
	public abstract void move(int mx, int my);
}


