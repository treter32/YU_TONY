import java.util.Scanner;
public class box
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = keyboard.nextLine();
		int length = input.length();
		
		for(int i = 0; i < length; i++)
		{
			System.out.print(input + "\n");
		}

	
	}	
}