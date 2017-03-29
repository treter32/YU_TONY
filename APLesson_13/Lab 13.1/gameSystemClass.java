public class gameSystemClass
{
	private String platform;
	private int serialNo;
	
	public gameSystemClass()
	{
		platform = "";
		serialNo = (int)(Math.random() * Math.pow(10,7))+1;
	}
	
	public gameSystemClass(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * Math.pow(10,7))+1;
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