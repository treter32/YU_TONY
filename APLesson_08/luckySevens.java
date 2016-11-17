import java.util.Scanner;
public class luckySevens
{	   
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a number:");
	   int num = kb.nextInt();
	   System.out.println(luck(num));
	}

	public static int luck(int num)
	{
		if(num > 0)
		{
			if(num%10==7)
			{
				return 1 + (luck(num/10));
			}
			
			else
			{
				return 0 + (luck(num/10));
			}
		}		
		return 0;
	}
}