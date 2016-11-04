import java.util.Scanner;
public class digitAdder
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		String snumber = keyboard.nextLine();
		
		int number = Integer.parseInt(snumber);
		int sum = 0;
		
		System.out.println(number);
		
		while (number > 0)
		{
			sum = sum + number%10;
			number /= 10;
		}

		System.out.println(sum);
	
	}	
	

}

