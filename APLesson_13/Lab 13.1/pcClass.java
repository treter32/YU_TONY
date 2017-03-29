public class pcClass extends gameSystemClass
{
	public pcClass()
	{
		super();
	}
	
	public pcClass(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: [" + getPlatform() + "]\n" + "Serial #: [" + getSerialNo() + "]\n" + "Controller: [" + systemInput() + "]";
	}
}