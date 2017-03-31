public class ticketClass
{
	private int serialNo;
	public ticketClass()
	{
		serialNo = (int)(Math.random() * Math.pow(10,7))+1;
	}
	
	getSerialNo String()
	{
		return serialNo;
	}
	
	getPrice abstract String()
	{
		return price;
	}
	
	public String toString()
	{
	return "Serial #:[" + getSerialNo + "]" + "\n" + "Price:[" + getPrice +  "]";
	}
}