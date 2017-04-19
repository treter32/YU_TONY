public class advanceClass extends ticketClass
{
	private int daysLeft;
	
	public advanceClass()
	{
		super();
	}
	
	public advanceClass(int d)
	{
		super();
		this.daysLeft = d;
	}
	
	public double getPrice()
	{
		if(daysLeft>=10)
		{
			return 30;
		}

		else	
		{	
			return 40;
		}	
	}
}