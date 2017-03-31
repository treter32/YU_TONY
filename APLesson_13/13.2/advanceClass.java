public class advanceClass extends ticketClass
{
	private int daysLeft;
	public advanceClass(int d)
	{
		daysLeft = d;
	}
	
	public getPrice()
	{
		super();
		if(daysLeft>=10)
		{
			price = 30;
		}	

		else	
			price = 40;
	}
}