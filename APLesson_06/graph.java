import java.util.Scanner;
public class graph
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		String sinput = keyboard.nextLine();
		System.out.println("Enter table size");
		String ssize = keyboard.nextLine();
		
		int input = Integer.parseInt(sinput);
		int size = Integer.parseInt(ssize);
		
	
		
		
		for(int i = 1; i < size; i++)
		{
			int res = input * i;
			System.out.printf("%d %5s %5d \n", i, "|", res);
		}
	}	
}

