public class advanceClass extends ticketClass
{
	private int daysLeft;
	public advanceClass(int d)
	{
		daysLeft = d;
	}
	
	public int getPrice()
	{
		super();
		if(daysLeft>=10)
		{
			return 30;
		}	

		else	
		if(daysLeft<10)	
		{	
			return 40;
		}	
	}
}