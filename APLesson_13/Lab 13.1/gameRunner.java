public class gameRunner
{
	public static void main (String[]args)
	{
		pcClass pc = new pcClass("Random Desktop");
		playstation ps = new playstation();
		xbox xb = new xbox();
		
		System.out.println(ps);
		System.out.println(xb);
		System.out.println(pc);
	}	
}	