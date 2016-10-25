import java.util.Scanner;
public class sing
{	
	public static void main (String[]args)
	{	
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int number)
	{
		for(int i = 0; i < number; i++)
		{
			System.out.print(word + " ");
		}
		System.out.print("\n");
	}
}


