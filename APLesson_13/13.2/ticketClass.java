public abstract class ticketClass
{
	private int serialNo;
	public ticketClass()
	{
		serialNo = (int)(Math.random() * Math.pow(10,7))+1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
	return "Serial #:[" + getSerialNo + "]" + "\n" + "Price:[" + getPrice +  "]";
	}
}