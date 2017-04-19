public abstract class ticketClass
{
	private int serialNo;
	public ticketClass()
	{
		this.serialNo = (int)(Math.random() * Math.pow(10,7))+1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	
	public String toString()
	{
		return "g";
	}
}