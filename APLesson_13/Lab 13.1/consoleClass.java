public abstract class consoleClass extends gameSystemClass
{
	
	public consoleClass()
	{
		super();
	}	
	
	public consoleClass(String p)
	{
		super(p);
	}	
	
	public abstract String getController();
	
	
	
	public String toString()
	{
		return "Platform: [" + getPlatform() + "]\n" + "Serial #: [" + getSerialNo() + "]\n" + "Controller: [" + getController() + "]";
	}
}