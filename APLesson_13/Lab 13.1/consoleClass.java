public class consoleClass extends gameSystemClass
{
	public consoleClass(String p)
	{
		platform = p;
		serialNo = (1000000 + ran.NextInt(9000000));
		
	}
	
	public consoleClass(String p)
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}