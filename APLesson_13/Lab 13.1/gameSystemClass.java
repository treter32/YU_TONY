public class gameSystemClass
{
	private String platform;
	private int serialNo;
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (1000000 + ran.NextInt(9000000));
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}