public abstract class ticketClass
{
	private int serialNo;
	private int price = 0;
	public ticketClass()
	{
		serialNo = (int)(Math.random() * Math.pow(10,7))+1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Serial #: " + this.getSerialNo() + "\n" + "Price: " + this.getPrice();
	}
}