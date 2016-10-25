import java.util.Scanner;
public class factorial
{
	public static void main (String[]args)
	{	
		int factorial = 1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		String sinput = keyboard.nextLine();
		int input = Integer.parseInt(sinput);
		
		for(int i = 1; i < input+1; i++)
		{
			factorial = factorial * i;
		}

		System.out.println(factorial);
	
	}	
}