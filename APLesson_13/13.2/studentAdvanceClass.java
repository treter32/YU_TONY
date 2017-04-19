public class studentAdvanceClass extends advanceClass
{
	private int daysLeft;
	
	public studentAdvanceClass()
	{
		super();
	}
	
	public studentAdvanceClass(int d)
	{
		super();
		daysLeft = d;
	}
	
	public double getPrice()
	{

		if(daysLeft>=10)
		{
			return 15;
		}

		else
		{	
			return 20;
		}	
	}
}