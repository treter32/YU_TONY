import java.util.Scanner;
public class averageDigits
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		String snumber = keyboard.nextLine();
		
		int number = Integer.parseInt(snumber);
		int average = 0;
		double digits = 0;
		
		while (number > 0)
		{
			digits += 1;
			average = average + number%10;
			number /= 10;
		}

		double daverage = average * 1.0;
		daverage /= digits;
		System.out.println(daverage);
	
	}	
	

}

