import java.util.Scanner;
public class findTheZ
{	   
	public static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		
		fillArray();
		printArray();
		hasZs();
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++)
		{
			System.out.println("Please enter your starting words:");
			words[i] = kb.nextLine(); 
		}

	}
	
	public static void printArray()
	{
		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]);	
		}	
	}
	
	public static void hasZs()
	{
		System.out.println("The words with a z are");
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].indexOf("z") >= 0)
			{
				System.out.println(words[i]);			
			}	
		}
	}
	
	
}