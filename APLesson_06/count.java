import java.util.Scanner;
public class count
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to count to.");
		String scountTo = keyboard.nextLine();
		System.out.println("Enter number to count by.");
		String scountBy = keyboard.nextLine();
		
		int countTo = Integer.parseInt(scountTo);
		int countBy = Integer.parseInt(scountBy);
		
		for(int i = -1; i < countTo; i++)
		{
			i = i-1+countBy;
			System.out.println(i);
		}
	}	
}

