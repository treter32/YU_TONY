import java.util.Scanner;
public class reverseNumber
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		String snumber = keyboard.nextLine();
		
		int number = Integer.parseInt(snumber);
		int rev = 0;
		
		while (number > 0)
		{
			rev *= 10;
			rev = rev + number%10;
			number /= 10;
		}

		System.out.println(rev);
	
	}	
	

}

