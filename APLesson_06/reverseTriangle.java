import java.util.Scanner;
public class reverseTriangle
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = keyboard.nextLine();
		int length = input.length();
		
		for(int i = length; i >= 0; i--)
		{
			System.out.println(input.substring(length-i));
		}

		
	
	}	
	

}

