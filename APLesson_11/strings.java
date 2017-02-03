import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class strings
{
	
	

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String[][] words = new String[4][4];
		
		for(int a=0;a<words.length;a++)
		{
			for (int b=0;b<words[a].length; b++)
			{
				System.out.println("Enter a word: ");
				words[i][j] = keyboard.next();
			}
		}
		
		for(int i=0;i<words.length;i++)
		{
			for (int b=0;b<words[a].length;b++)
			{
				System.out.print("    " + words[a][b]);
			}
			System.out.print("\r\n");
		}
	}
	
}