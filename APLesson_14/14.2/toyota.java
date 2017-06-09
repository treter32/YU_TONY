public class toyota extends car
{
	
	public toyota(String pos)
	{
		String[] sPos = pos.split(", ");
		this.move(Double.parseDouble(sPos[0]), Double.parseDouble(sPos[1]));
	}
}